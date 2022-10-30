/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplecalculator;

import java.util.Scanner;

/**
 *
 * @author Ethan
 */
public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Get input from user
        Scanner console = new Scanner(System.in);
        System.out.print("Please input two numbers, separated by space: ");
        String[] twoNum = console.nextLine().split(" ");
        System.out.print("Please enter the operator (+, -, *, or /): ");
        char operate = console.nextLine().charAt(0);
        System.out.print("Please enter a formula, e.g.: \"3.14 * 2\": ");
        String formular = console.nextLine();

        // Extract data from input
        double first = Double.parseDouble(twoNum[0]);
        double second = Double.parseDouble(twoNum[1]);
        double result1 = calcResult(first, second);
        double result2 = calcResult(first, second, operate);
        double result3 = calcResult(formular);

        // Log results
        System.out.printf("%-26s: %.2f + %.2f = %.2f%n",
                          "Calling the first method ", first, second, result1);
        System.out.printf("%-26s: %.2f %c %.2f = %.2f%n",
                          "Calling the second method ",
                          first, operate, second, result2);
        System.out.printf("%-26s: %s = %.2f%n",
                          "Calling the third method", formular, result3);
    }

    static double calcResult(double num1, double num2) { return num1 + num2; }

    static double calcResult(double num1, double num2, char operator) {
        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> -1;
        };
    }

    static double calcResult(String formula) {
        String[] operationsArr = formula.split(" ");
        return calcResult(Double.parseDouble(operationsArr[0]),
               Double.parseDouble(operationsArr[2]),
               operationsArr[1].charAt(0));
    }
}
