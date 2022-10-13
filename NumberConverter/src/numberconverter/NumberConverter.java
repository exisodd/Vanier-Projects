/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberconverter;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Ethan Tran
 */
public class NumberConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create scanner object
        Scanner GetInput = new Scanner(System.in);
        
        // Get input
        System.out.print("Please enter a 4-digit Octal number: ");
        
        // Initialize variables
        int octal = GetInput.nextInt();
        int decimal = 0;
        
        for (int i = 0; i < 4; i++)
        {
            // To get digit, modulo 10^i + 1, and divide by by 10^i
            int modulo = (int) Math.pow(10, i + 1);
            int divider = (int) Math.pow(10, i);
            int digit = octal % modulo / divider;
            decimal += digit * Math.pow(8, i);
        }
        
        // Print results
        System.out.println("");
        System.out.printf("%-14s: %d%n", "Octal number ", octal);
        System.out.printf("%-14s: %d%n", "Decimal number ", decimal);
    }
    
}
