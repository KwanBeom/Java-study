package chat;

import java.io.*;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        String name = args[0];

        Socket socket = new Socket("127.0.0.1", 9999);
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        InputThread inputThread = new InputThread(reader);
        inputThread.start();

        String line = null;
        while ((line = keyboard.readLine()) != null) {
            writer.println(name + " : " + line);
            writer.flush();
        }

        writer.close();
        keyboard.close();
        socket.close();
    }
}


class InputThread extends Thread {
    BufferedReader reader = null;

    public InputThread(BufferedReader reader) {
        this.reader = reader;
    }

    @Override
    public void run() {
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}