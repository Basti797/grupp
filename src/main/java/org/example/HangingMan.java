package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HangingMan {

    private static String word = "";

    private static List<Character> guessedLetters = new ArrayList<>();

    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to HangMan");
        System.out.println("Player 1: enter a word to guess for");

        word = scan.nextLine();
        System.out.println("\n".repeat(50));
        System.out.println("Word chosen!");

        printScores(word);

        while (true) {
            System.out.println("Player 2: choose an option");
            System.out.println("1. guess word");
            System.out.println("2. guess letter");

            int option = Integer.parseInt(scan.nextLine());
            switch (option) {
                case 1 -> guessWord(scan);
                case 2 -> guessLetter(scan);
                default -> System.out.println(option + " is not an option, try again.");
            }

            printScores(word);
        }
    }

    private static void guessLetter(Scanner scan) {
        System.out.println("Enter a letter: ");
        char letter = scan.nextLine().charAt(0);

        guessedLetters.add(letter);
        if (word.contains(""+letter)) {
            System.out.println("Word contains the letter " + letter + "!");
        } else {
            System.out.println("Word does not contain the letter " + letter + "!");
        }
    }

    private static void guessWord(Scanner scan) {
        System.out.println("Enter word to guess: ");
        String guess = scan.nextLine();

        if (guess.equalsIgnoreCase(word)) {
            System.out.println("Correct! the word was " + word);
            System.exit(0);
        } else {
            System.out.println("Incorrect.");
        }
    }

    private static void printScores(String word) {
        for (int i = 0; i < word.length(); ++i) {
            char letter = word.charAt(i);
            if (guessedLetters.contains(letter)) {
                System.out.print(letter + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }
}
