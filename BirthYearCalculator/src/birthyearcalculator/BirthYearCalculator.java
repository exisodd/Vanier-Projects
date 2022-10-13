/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package birthyearcalculator;

import java.util.Scanner;

/**
 * @author Ethan
 */
public class BirthYearCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create scanner instance
        Scanner GetInput = new Scanner(System.in);

        // Get Input
        System.out.print("Please input a birth year: ");
        String birth = GetInput.nextLine();

        // Extract century and decade from String birth
        int century = Integer.parseInt(birth.substring(0, 2)) + 1;
        int decade = (birth.charAt(2) - 48) * 10;

        // Print results
        System.out.printf("%-10s: %s%n", "Birth Year", birth);
        System.out.printf("%-10s: %d%n", "Century", century);
        System.out.printf("%-10s: %d", "Decade", decade);
    }

}
