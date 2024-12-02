package com.example;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 7};
        int[] array2 = {1, 2, 3, 4, 10};
        int compare = Arrays.compare(array1, array2);
        System.out.println(compare);
        Arrays.sort(array1);
        int index = Arrays.binarySearch(array1, 4);
        System.out.println(index);

        Book[] books = new Book[5];
        books[0] = new Book("JS", 1000);
        books[1] = new Book("Python", 1100);
        books[2] = new Book("Java", 1200);
        books[3] = new Book("Dart", 500);
        books[4] = new Book("C#", 1150);

        Arrays.sort(books, (prev, curr) -> prev.getName().compareTo(curr.getName()) * -1);
        for (Book book : books) {
            System.out.println(book.getName());
        }
    }
}

class Book implements Comparable<Book> {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Book other) {
        return this.name.compareTo(other.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}