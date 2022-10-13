/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package balancecalculator;

import java.util.Scanner;

/**
 *
 * @author Ethan Tran
 */
public class BalanceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create scanner object to get input
        Scanner GetInput = new Scanner(System.in);

        // Get input for name, age, gender, and department
        System.out.print("Please enter the initial balance: $");
        double balance = GetInput.nextDouble();
        System.out.print("Please enter the annual interest rate (2 for 2%): ");
        double interest = GetInput.nextDouble();
        System.out.print("Please enter the number of years the client wants to "
                       + "save the money in the bank: ");
        int years = GetInput.nextInt();

        // Print results
        // If years is under 10, adjust left 22 spaces, 
        // else adjust 23 spaces for extra digit
        if (years < 10) {
            System.out.printf("%-22s: %.2f%n", "Initial Balance ",balance);
            System.out.printf("%-22s: %.2f%%%n", 
                          "Annual Interest Rate ", interest);
            System.out.printf("%-22s: %d%n", "Saving Years ", years);
            System.out.println("-------------------------------------------");
        } else {
            System.out.printf("%-23s: %.2f%n", "Initial Balance ", balance);
            System.out.printf("%-23s: %.2f%%%n", 
                          "Annual Interest Rate ", interest);
            System.out.printf("%-23s: %d%n", "Saving Years ", years);
            System.out.println("-------------------------------------------");
        }

        // Calculate new balance
        for (int i = 0; i < years; i++) {
            balance += (interest / 100) * balance;
        }
        System.out.printf("Balance after %d Years : %.2f%n", years, balance);
    }

}
