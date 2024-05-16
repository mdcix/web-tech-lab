import java.io.*;
import java.net.*;

public class EchoServer{
    public static void main(String[] args) {
        int port = 12345; // Port number for the server to listen on

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected from " + clientSocket.getInetAddress());

                // Create input and output streams for the client socket
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    
                    PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)) {
                    String message = reader.readLine();
                    System.out.println("Received from client: " + message);

                    // Echo the message back to the client
                    writer.println("Server Echo: " + message);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

