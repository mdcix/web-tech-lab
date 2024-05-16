import java.io.*;
import java.net.*;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        String serverHost = "localhost"; // Server hostname or IP address
        int serverPort = 12345; // Port number the server is listening on

        try (Socket socket = new Socket(serverHost, serverPort);
             
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a message to send to the server: ");
            String message = scanner.nextLine();

            // Send the message to the server
            writer.println(message);

            String response = reader.readLine();
          System.out.println(response);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

