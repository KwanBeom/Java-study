package com.example.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9090);
        System.out.println("서버가 9090 port에서 대기 중");
        System.out.println("클라이언트 접속을 기다리는 중 ..");

        // 소켓은 클라이언트와 통신할 수 있는 객체
        Socket socket = serverSocket.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

        String line;
        while (!(line = in.readLine()).isEmpty()) {
            System.out.println("클라이언트 메시지: " + line);
        }

        out.println("HTTP/1.1 200 OK");
        out.println("name: choi");
        out.println("email: bk0112@naver.com");
        out.println();
        out.println("<html>");
        out.println("<h1>Hello!</h1>");
        out.println("</html>");
        out.close();
        System.out.println(socket.toString());
        serverSocket.close();
        System.out.println("서버가 닫힙니다");
    }
}
