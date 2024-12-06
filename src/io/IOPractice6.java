package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class IOPractice6 {
    public static void main(String[] args) {
        try {
            IOPractice6.ByteArrayOutputStreamPractice();
            IOPractice6.ByteArrayInputStreamPractice();
        } catch (Exception exception) {
            System.out.println(exception.toString());
        }

    }

    public static void ByteArrayOutputStreamPractice() throws Exception {
        int data1 = 1;
        int data2 = 2;
        // 메모리 상에 데이터를 저장
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(data1);
        out.write(data2);
        out.close();

        byte[] array = out.toByteArray();
        System.out.println(array[0]);
        System.out.println(array[1]);
    }

    public static void ByteArrayInputStreamPractice() throws Exception {
        byte[] array = new byte[2];
        ByteArrayInputStream in = new ByteArrayInputStream(array);
        array[0] = (byte) 1;
        array[1] = (byte) 2;
        int read1 = in.read();
        int read2 = in.read();
        int read3 = in.read();
        System.out.println(read1);
        System.out.println(read2);
        System.out.println(read3);
        in.close();
    }
}
