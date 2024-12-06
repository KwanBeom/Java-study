package io;

import java.io.*;

public class IOPractice4 {
    public static void main(String[] args) {
        try {
//            io.IOPractice4.printWriterPractice();
            IOPractice4.BufferedReaderPractice();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void printWriterPractice() throws Exception {
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream("src/tmp/my.txt")));
        printWriter.println("hello");
        printWriter.println("world");
        printWriter.close();
    }

    public static void BufferedReaderPractice() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("src/tmp/my.txt")));
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        bufferedReader.close();
    }
}
