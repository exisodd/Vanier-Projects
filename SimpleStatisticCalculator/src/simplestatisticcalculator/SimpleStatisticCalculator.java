/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplestatisticcalculator;

import java.util.Scanner;
import java.lang.Math;

/**
 * @author Ethan
 */
public class SimpleStatisticCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create scanner instance
        Scanner GetInput = new Scanner(System.in);

        // Get input
        System.out.print("Please input 5 numbers: ");
        String numberString = GetInput.nextLine().toLowerCase();
        String[] numbersArr = numberString.split(" ");

        // Convert numbersArr into array of floats
        int length = numbersArr.length;
        double[] numbers = new double[length];
        for (int i = 0; i < length; i++) {
            double num = Double.parseDouble(numbersArr[i]);
            numbers[i] = num;
        }

        // Compute sum, min, max
        double sum = 0;
        double max = -99999999;
        double min = 99999999;
        for (double num : numbers) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            sum += num;
        }

        // Compute mean, standard deviation
        double mean = sum / length;
        double stdDev = 0;
        for (double num : numbers) {
            stdDev += Math.pow(num - mean, 2);
        }
        stdDev = Math.sqrt(stdDev / length);

        // Print results
        System.out.printf("%-19s: %.2f, %.2f, %.2f, %.2f, %.2f%n", "Numbers",
                          numbers[0], numbers[1], numbers[2], numbers[3], numbers[4]);
        System.out.printf("%-19s: %.2f%n", "Mean", mean);
        System.out.printf("%-19s: %.2f%n", "Minimum", min);
        System.out.printf("%-19s: %.2f%n", "Maximum", max);
        System.out.printf("%-19s: %.2f%n", "Standard Deviation", stdDev);
    }

}
