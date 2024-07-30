package org.example;
import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return abbreviations.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return abbreviations.get(abbreviation);
    }

    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();

        // Add some abbreviations
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        // Test the methods
        System.out.println("Abbreviations added: e.g., etc., i.e.");

        System.out.println("\nTesting has Abbreviation method:");
        System.out.println("Has 'e.g.'? " + abbreviations.hasAbbreviation("e.g."));
        System.out.println("Has 'lol'? " + abbreviations.hasAbbreviation("lol"));

        System.out.println("\nTesting find Explanation For method:");
        System.out.println("Explanation for 'e.g.': " + abbreviations.findExplanationFor("e.g."));
        System.out.println("Explanation for 'etc.': " + abbreviations.findExplanationFor("etc."));
        System.out.println("Explanation for 'lol': " + abbreviations.findExplanationFor("lol"));

        // Example usage in a sentence
        String text = "e.g. i.e. etc. lol";
        System.out.println("\nOriginal text: " + text);
        System.out.print("Expanded text: ");
        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }
            System.out.print(part + " ");
        }
        System.out.println();
    }
}