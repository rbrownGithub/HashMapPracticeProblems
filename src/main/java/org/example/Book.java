package org.example;

public class Book {
    private String name;
    private int year;
    private String contents;

    public Book(String name, int year, String contents) {
        this.name = name;
        this.year = year;
        this.contents = contents;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " (" + this.year + ") Contents: " + this.contents;
    }
}