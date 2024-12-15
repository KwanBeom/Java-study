package com.example.Thread;

public class ThreadMain {
    public static void main(String[] args) {
//        MyThread myThread1 = new MyThread("*");
//        MyThread myThread2 = new MyThread("+");
//        myThread1.start();
//        myThread2.start();

        MyRunnable runnable1 = new MyRunnable("*");
        MyRunnable runnable2 = new MyRunnable("+");
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
    }
}
