/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulochecker;

import java.util.Scanner;

/**
 *
 * @author Ethan
 */
public class ModuloChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner object
        Scanner console = new Scanner(System.in);

        // First two methods
        System.out.print("Please enter a number and a base, separated by space: ");
        String[] in1 = console.nextLine().split(" ");
        int num1 = Integer.parseInt(in1[0]);
        int num2 = Integer.parseInt(in1[1]);

        if (isDivisible(num1)) {
            System.out.printf("%d is divisible by 3%n", num1);
        }

        if (isDivisible(num1, num2)) {
            System.out.printf("%d is divisible by %d%n", num1, num2);
        }

        System.out.print("\nPlease enter an English letter: ");
        char letter = console.nextLine().charAt(0);
        System.out.print("Please enter a number and a letter base, separated by space: ");
        String[] in3 = console.nextLine().split(" ");
        int letter_num = Integer.parseInt(in3[0]);
        char letter_base = in3[1].charAt(0);

        if (isDivisible(letter)) {
            System.out.printf("'%c' is divisible by 3\n", letter);
        }
        if (isDivisible(letter, letter_num)) {
            System.out.printf("'%c' is divisible by %d\n", letter, letter_num);
        }
        if (isDivisible(letter, letter_base)) {
            System.out.printf("'%c' is divisible by '%c'\n", letter, letter_base);
        }

    }

    static int letterToNumber(char c) {
        return Character.toTitleCase(c) - 65;
    }

    static boolean isDivisible(int num) {
        return num % 3 == 0;
    }

    static boolean isDivisible(int num, int base) {
        return num % base == 0;
    }

    static boolean isDivisible(char letter) {
        return letterToNumber(letter) % 3 == 0;
    }

    static boolean isDivisible(char letter, int base) {
        return letterToNumber(letter) % base == 0;
    }

    static boolean isDivisible(char letter, char base) {
        return letterToNumber(letter) % letterToNumber(base) == 0;
    }
}
