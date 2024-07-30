package org.example;
import java.util.HashMap;

public class Program {
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }

    // NEW METHOD: Print all values (Book objects) in the hashmap
    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    }

    // NEW METHOD: Print Book objects whose names contain the given text
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().toLowerCase().contains(text.toLowerCase())) {
                System.out.println(book);
            }
        }
    }

    // Modified main method to demonstrate both original and new functionality
    public static void main(String[] args) {
        // Original demonstration
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        System.out.println("Original functionality:");
        System.out.println("All keys:");
        printKeys(hashmap);
        System.out.println("---");
        System.out.println("Keys containing 'i':");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        System.out.println("Values of keys containing '.e':");
        printValuesOfKeysWhere(hashmap, ".e");

        System.out.println("\nNew functionality:");
        // New demonstration
        HashMap<String, Book> bookMap = new HashMap<>();
        bookMap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        bookMap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        System.out.println("All books:");
        printValues(bookMap);
        System.out.println("---");
        System.out.println("Books containing 'prejud':");
        printValueIfNameContains(bookMap, "prejud");
    }
}