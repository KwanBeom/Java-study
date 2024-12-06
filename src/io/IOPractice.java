package io;

import java.io.IOException;
import java.io.InputStream;

public class IOPractice {
    public static void main(String[] args) {
        InputStream in = null;
        int[] a = new int[0];
        try {
            int data = in.read();
            System.out.println(data);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
