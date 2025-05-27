import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started...");

        Socket socket = serverSocket.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String line;
        while ((line = in.readLine()) != null) {
            System.out.println("Client says: " + line);
            out.println("Echo: " + line);
        }

        socket.close();
        serverSocket.close();
    }
}

