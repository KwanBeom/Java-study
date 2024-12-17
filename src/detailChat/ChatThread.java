package detailChat;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatThread extends Thread {
    List<ChatThread> list;
    private String name;
    private BufferedReader reader;
    private PrintWriter writer;
    private Socket socket;

    public ChatThread(Socket socket, List<ChatThread> list) throws IOException {
        this.socket = socket;
        this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        this.name = reader.readLine();
        this.list = list;
        this.list.add(this);
    }


    @Override
    public void run() {
        String line;
        try {
            broadcast(name + "님이 연결되었습니다.", false);

            while (((line = reader.readLine()) != null)) {
                broadcast(name + " : " + line, true);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            broadcast(name + "님이 퇴장했습니다.", false);
            this.list.remove(this);
        }

    }

    public void sendMessage(String message) {
        writer.println(message);
        writer.flush();
    }

    private void broadcast(String message, boolean include) {
        List<ChatThread> chatThreads = new ArrayList<>(list);
        try {
            for (ChatThread chatThread : chatThreads) {
                if (!include && chatThread == this) {
                    continue;
                }
                chatThread.sendMessage(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

