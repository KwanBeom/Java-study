package io;

import java.io.File;
import java.io.IOException;

public class IOPractice2 {
    public static void main(String[] args) {
//        FileIOPractice.readFilePractice();
//        FileIOPractice.readFilesPractice();
        IOPractice2.createTempFilePractice();
    }

    public static void readFilePractice() {
        File file = new File("src/example.txt");
        if (file.exists()) {
            System.out.println("파일 이름: " + file.getName());
            System.out.println("파일 크기: " + file.length() + " 바이트");
            System.out.println("절대 경로: " + file.getAbsolutePath());
            System.out.println(file.getPath());
            boolean deleteFlag = file.delete();
            System.out.println("삭제 여부: " + deleteFlag);
        } else {
            System.out.println("파일이 존재하지 않습니다.");
        }
    }

    public static void readFilesPractice() {
        File file = new File("src/tmp");
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                System.out.println(f.getName());
            }
        }

    }

    public static void createTempFilePractice() {
        try {
            File f = File.createTempFile("tmp_", ".dat");
            System.out.println((f.getAbsoluteFile()));
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            f.deleteOnExit();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
