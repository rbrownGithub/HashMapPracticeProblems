package org.example;
import java.util.HashMap;

public class Nicknames{
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, String> nicknames = new HashMap<>();

        // Store names and nicknames
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        // Get Matthew's nickname and print it
        String matthewNickname = nicknames.get("matthew");
        System.out.println(matthewNickname);
    }
}