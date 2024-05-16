import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ChatServer {
    public static void main(String[] args) {
        int serverPort = 12345;

        try (DatagramSocket serverSocket = new DatagramSocket(serverPort)) {
            System.out.println("Server is running on port " + serverPort);

            while (true) {
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);

                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                System.out.println("Received from client (" + clientAddress + ":" + clientPort + "): " + message);

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

