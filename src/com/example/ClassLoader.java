package com.example;

import java.lang.reflect.Method;

public class ClassLoader {
    public static void main(String[] args) throws Exception {
        String className = "com.example.Bus";
        Class<?> clazz = Class.forName(className);
//        Method[] declaredMethods = clazz.getDeclaredMethods();
//        for (Method m : declaredMethods) {
//            System.out.println(m.getName());
//        }

        Object o = clazz.newInstance();
        Bus b = (Bus) o;
        b.a();
    }
}
