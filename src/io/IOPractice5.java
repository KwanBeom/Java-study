package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOPractice5 {
    public static void main(String[] args) {
        try {
            IOPractice5.DataInputStreamPractice();
            IOPractice5.DataOutputStreamPractice();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void DataInputStreamPractice() throws Exception {
        String name = "kim";
        int kor = 90;
        int eng = 50;
        int math = 70;
        double total = kor + eng + math;
        double avg = total / 3;

        DataOutputStream out = new DataOutputStream(new FileOutputStream("src/tmp/score.dat"));
        out.writeUTF(name);
        out.writeInt(kor);
        out.writeInt(eng);
        out.writeInt(math);
        out.writeDouble(total);
        out.writeDouble(avg);
        out.close();
    }

    public static void DataOutputStreamPractice() throws Exception {
        DataInputStream in = new DataInputStream(new FileInputStream("src/tmp/score.dat"));
        String name = in.readUTF();
        int kor = in.readInt();
        int eng = in.readInt();
        int math = in.readInt();
        double total = in.readDouble();
        double avg = in.readDouble();
        in.close();

        System.out.println(name);
    }
}
