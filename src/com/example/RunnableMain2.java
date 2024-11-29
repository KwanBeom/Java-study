package com.example;

public class RunnableMain2 {
    public static void main(String[] args) {
        RunnableExecute runnableExecute = new RunnableExecute();
//
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Run!!!!");
//            }
//        };
//
//        runnableExecute.execute(runnable);
//
//        runnableExecute.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("hello");
//            }
//        });

        Runnable runnable = () -> {
            System.out.println("lambda run!");
        };

        runnableExecute.execute(runnable);
    }
}
