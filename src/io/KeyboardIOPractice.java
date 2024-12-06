package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KeyboardIOPractice {
    public static void main(String[] args) {
        KeyboardIOPractice.scannerPractice();
    }

    public static void bufferedReaderPractice() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println("읽어들인 값: " + line);
        }
    }

    public static void scannerPractice() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("입력받은 값: " + input);
    }
}