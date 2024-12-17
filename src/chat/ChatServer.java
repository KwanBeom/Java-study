package chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(9999)) {
            List<PrintWriter> writerList = Collections.synchronizedList(new ArrayList<>());
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("접속 : " + socket);
                ChatThread chatThread = new ChatThread(socket, writerList);
                chatThread.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ChatThread extends Thread {
    private List<PrintWriter> writerList;
    private Socket socket;
    private PrintWriter writer;
    private BufferedReader reader;


    public ChatThread(Socket socket, List<PrintWriter> writerList) {
        this.socket = socket;
        this.writerList = writerList;
        try {
            this.writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writerList.add(writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                for (PrintWriter w : writerList) {

                    w.println(line);
                    w.flush();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writerList.remove(writer);
            } catch (Exception e) {
                e.printStackTrace();
            }
for(PrintWriter w: writerList) {
    w.println("어떤 클라이언트가 접속을 끊었어요.");
    w.flush();
}
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
