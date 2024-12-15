package com.example.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9090);
        try {
            while (true) {
                Socket socket = serverSocket.accept();
                ClientThread clientThread = new ClientThread(socket);
                clientThread.start();
            }
        } finally {
            serverSocket.close();
        }
    }

}

class ClientThread extends Thread {
    private final Socket clientSocket;

    public ClientThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void start() {
        super.start();
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(new PrintWriter(clientSocket.getOutputStream()));
            String firstLine = in.readLine();
            String message = "";
            if (firstLine.contains("hello")) message = "hello";
            else if (firstLine.contains("hi")) message = "hi";

            String line;
            while (!(line = in.readLine()).isEmpty()) {
                System.out.println(line);
            }
            out.println("HTTP/1.1 200 OK");
            out.println("name: choi");
            out.println("email: bk0112@naver.com");
            out.println();
            out.println("<html>");
            out.println("<h1 >" + message + " Hello!" + "</h1>");
            out.println("</html>");
            out.flush();
            in.close();
            clientSocket.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}