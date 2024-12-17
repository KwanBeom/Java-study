package detailChat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("사용법: java com.example.chat2.ChatClient 닉네임");
            return;
        }
        String name = args[0];
        Socket socket = new Socket("127.0.0.1", ChatServer.PORT); // 소켓을 통해 서버에 연결
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader keyboard = new BufferedReader((new InputStreamReader(System.in)));

        // name을 serverSocket에 전송
        writer.println(name);
        writer.flush();

        // 백그라운드로 서버가 보내준 메시지를 읽어들여 화면에 출력
        InputThread inputThread = new InputThread(reader);
        inputThread.start();

        // client는 읽어들인 메시지를 서버에 전송
        try {
            String line;
            while ((line = keyboard.readLine()) != null) {
                if ("/quit".equals(line)) break;
                writer.println(line);
                writer.flush();
            }
        } catch (Exception e) {
            System.out.println("...");
        } finally {
            writer.close();
            reader.close();
            keyboard.close();
            socket.close();
            System.out.println("연결이 종료되었습니다.");
        }
    }
}

class InputThread extends Thread {
    BufferedReader reader;

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
        } catch (Exception e) {
            System.out.println("..");
        }

    }
}
