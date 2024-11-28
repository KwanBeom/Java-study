package com.example.util;

public class Calculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int val = cal.plus(1, 2);
        System.out.println(val);
    }

    public int plus(int x, int y) {
        return x + y;
    }
}
