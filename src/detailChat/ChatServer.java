package detailChat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatServer {
    protected static int PORT = 8888;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(ChatServer.PORT);
        List<ChatThread> list = Collections.synchronizedList(new ArrayList<>());
        while (true) {
            Socket socket = serverSocket.accept(); // client 접속
            ChatThread chatThread = new ChatThread(socket, list);
            chatThread.start();
        }
    }
}
