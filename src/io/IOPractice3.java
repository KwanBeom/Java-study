package io;

import java.io.*;

public class IOPractice3 {
    public static void main(String[] args) {
        try {
//            io.IOPractice3.biteWritePractice();
//            io.IOPractice3.biteReadPractice();
//            io.IOPractice3.textWritePractice();
            IOPractice3.textReadPractice();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void biteWritePractice() throws Exception {
        OutputStream outputStream = new FileOutputStream("src/tmp/hello01.dat");
        outputStream.write(1);
        outputStream.write(255);
        outputStream.close();
    }

    public static void biteReadPractice() throws Exception {
        InputStream inputStream = new FileInputStream("src/tmp/hello01.dat");
        int i1 = inputStream.read();
        int i2 = inputStream.read();

        System.out.println(i1);
        System.out.println(i2);
        inputStream.close();
    }

    public static void textWritePractice() throws Exception {
        Writer writer = new FileWriter("src/tmp/hello.txt");
        writer.write("hello my name is beomkwan");
        writer.write('!');
        writer.close();
    }

    public static void textReadPractice() throws Exception {
        Reader reader = new FileReader("src/tmp/hello.txt");
        System.out.println((char)reader.read());
        System.out.println((char)reader.read());
        System.out.println((char)reader.read());
        int ch = -1;

        while((ch = reader.read()) != -1) {
            System.out.println((char)ch);
        }
        reader.close();
    }
}
