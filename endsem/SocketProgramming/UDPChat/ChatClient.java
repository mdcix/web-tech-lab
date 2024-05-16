import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        String serverHost = "localhost"; 
        int serverPort = 12345;

        try (DatagramSocket clientSocket = new DatagramSocket()) {
            InetAddress serverAddress = InetAddress.getByName(serverHost);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Type 'exit' to end the chat.");

            while (true) {
                System.out.print("Enter a message: ");
                String message = scanner.nextLine();

                byte[] sendData = message.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
                clientSocket.send(sendPacket);

                if (message.trim().equalsIgnoreCase("exit")) {
                    System.out.println("Chat ended.");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

