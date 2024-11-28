package com.example.main;

import com.example.util.Calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int value = cal.plus(5, 5);
        System.out.println(value);
    }
}
