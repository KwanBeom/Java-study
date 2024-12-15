package com.example.Thread;

public class MyThread extends Thread {
    private final String str;

    public MyThread(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        // 1초마다 *을 10번 출력하는 코드
        for (int i = 0; i < 10; i++) {
            System.out.print(str);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
