package com.example;

public class AnonymousClass {
    public static void main(String[] args) {
        Car car = new Car() {
            @Override
            public void a() {
                System.out.println("익명 클래스의 a 메서드 오버라이딩");
            }
        };

        car.a();
    }
}
