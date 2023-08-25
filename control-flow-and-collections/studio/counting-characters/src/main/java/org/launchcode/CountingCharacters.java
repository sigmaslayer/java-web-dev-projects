package org.launchcode;

import java.util.HashMap;

public class CountingCharacters {
    static String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with." +
            "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero." +
            "Once you’ve done that, it’s pretty straightforward from there.";
    public static void main(String[] args) {
        countCharacter(quote);
    }

    public static void countCharacter(String name) {

        HashMap<Character, Integer> characterCounts = new HashMap<>();
        for (char c : name.toCharArray())   {
            if (characterCounts.get(c) != null) {
                characterCounts.put(c, characterCounts.get(c) + 1);
            } else {
                characterCounts.put(c, 1);
            }
        }
        characterCounts.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
