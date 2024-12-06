package io;

import java.io.*;
import java.util.ArrayList;

public class IOPractice8 {
    public static void main(String[] args) {
        try {
//            IOPractice8.ObjectOutputPractice();
//            IOPractice8.ObjectInputPractice();
            IOPractice8.ObjectOutputPractice2();
            IOPractice8.ObjectInputPractice2();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void ObjectOutputPractice() throws Exception {
        Human human = new Human("최범관", 2001, 176.5, 78.2);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/tmp/human.dat"));
        out.writeObject(human);
        out.close();
    }

    public static void ObjectInputPractice() throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/tmp/human.dat"));
        Human human = (Human) in.readObject();
        System.out.println(human.toString());
    }

    public static void ObjectOutputPractice2() throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/tmp/human2.dat"));
        ArrayList<Human> list = new ArrayList<>();
        Human human1 = new Human("박참치", 2002, 190, 59);
        Human human2 = new Human("이장군", 1999, 168, 68);
        Human human3 = new Human("홍길동", 1987, 175, 90);
        list.add(human1);
        list.add(human2);
        list.add(human3);
        out.writeObject(list);
        out.close();
    }

    public static void ObjectInputPractice2() throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/tmp/human2.dat"));
        ArrayList<Human> list = (ArrayList) in.readObject();
        for (Human human : list) {
            System.out.println(human);
        }
    }
}


class Human implements Serializable {
    private String name;
    private int birthYear;
    private double height;
    private double weight;

    public Human(String name, int birthYear, double height, double weight) {
        this.name = name;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Human{" + "name='" + name + '\'' + ", birthday='" + birthYear + '\'' + ", height=" + height + ", weight=" + weight + '}';
    }
}