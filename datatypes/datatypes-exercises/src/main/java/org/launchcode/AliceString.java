package org.launchcode;
import java.util.Scanner;

public class AliceString {
    public static void main(String[] args) {
        String aliceQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or " +
                "twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and " +
                "what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        System.out.println(aliceQuote);

        Scanner input = new Scanner(System.in);
        System.out.println("Search for a word in the quote:");
        String userWord = input.nextLine().toUpperCase();
        aliceQuote.toUpperCase();
        System.out.println(aliceQuote.contains(userWord));
    }
}
