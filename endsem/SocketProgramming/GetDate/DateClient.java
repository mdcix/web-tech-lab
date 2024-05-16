import java.io.*;
import java.net.*;

public class DateClient  {
    public static void main(String[] args) {
        String serverHost = "localhost"; 
        int serverPort = 12345; 

        try (Socket socket = new Socket(serverHost, serverPort);
             InputStream in = socket.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {

            String response = reader.readLine();
            System.out.println("\nServer's Response:");
            System.out.println(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

