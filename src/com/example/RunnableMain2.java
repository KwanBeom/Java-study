package com.example;

public class RunnableMain2 {
    public static void main(String[] args) {
        RunnableExecute runnableExecute = new RunnableExecute();

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Run!!!!");
            }
        };

        runnableExecute.execute(runnable1);

        runnableExecute.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });

        Runnable runnableLambda = () -> {
            System.out.println("lambda run!");
        };

        runnableExecute.execute(runnableLambda);
    }
}
