package io;

import java.io.StringReader;
import java.io.StringWriter;

public class IOPractice7 {
    public static void main(String[] args) {
        try {
            IOPractice7.StringWriterPractice();
            IOPractice7.StringReaderPractice();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void StringWriterPractice() throws Exception {
        StringWriter out = new StringWriter();
        out.write("hello");
        out.write("world");
        out.close();
        String str = out.toString();
        System.out.println(str);
    }

    public static void StringReaderPractice() throws Exception {
        StringReader in = new StringReader("helloworld");
        int ch = -1;
        while ((ch = in.read()) != -1) {
            System.out.println((char)ch);
        }
    }
}
