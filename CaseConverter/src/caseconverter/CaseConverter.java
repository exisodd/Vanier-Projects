/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caseconverter;

import java.util.Scanner;

/**
 *
 * @author Ethan
 */
public class CaseConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Get input from user
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String input = console.nextLine();

        System.out.println("Please choose the case you want to convert: ");
        System.out.println("1. 'l' or 'L' for lowercase ");
        System.out.println("2. 'u' or 'U' for uppercase ");
        System.out.println("3. 't' or 'T' for titlecase ");
        char typeCase = console.nextLine().charAt(0);

        // Log results
        System.out.printf("%n%-38s: %s%n", "Original word", input);
        System.out.printf("%-38s: %s%n",
                          "Calling the first convertCase method",
                          convertCase(input));
        System.out.printf("%-38s: %s%n",
                          "Calling the second convertCase method",
                          convertCase(input, typeCase));
    }

    static String convertCase(String word) {
        char first = Character.toTitleCase(word.charAt(0));
        String rest = word.substring(1).toLowerCase();
        return String.format("%c%s", first, rest);
    }

    static String convertCase(String word, char caseType) {
        return switch (Character.toUpperCase(caseType)) {
            case 'L' -> word.toLowerCase();
            case 'U' -> word.toUpperCase();
            case 'T' -> convertCase(word);
            default -> "";
        };
    }
    
}
