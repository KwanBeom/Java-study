package com.example.framework;

public abstract class Controller {
    protected final void init() {
        System.out.println("initialize");
    }

    protected final void close() {
        System.out.println("close");
    }

    protected abstract void run();

    public void execute() {
        this.init();
        this.run();
        this.close();
    }
}
