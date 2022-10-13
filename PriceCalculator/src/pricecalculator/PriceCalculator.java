/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pricecalculator;

import java.util.Scanner;

/**
 *
 * @author Ethan Tran
 */
public class PriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create scanner object to get input
        Scanner GetInput = new Scanner(System.in);
        
        // Initialize variables and constants
        final double FEDERAL_TAX = 5;
        final double PROVINCIAL_TAX = 9.975;
        double price, discount, fedTax, provTax, finalPrice;
        
        // Get input for name, age, gender, and department
        System.out.print("Please enter item price: ");
        price = Math.round(GetInput.nextDouble() * 100.0) / 100.0;
        System.out.print("Please enter discount ratio(5 for 5%): ");
        discount = Math.round(GetInput.nextDouble() * 100.0) / 100.0;
        
        // Print original price and discount ratio
        System.out.printf("%-17s: %.2f%n", "Original Price ", price);
        System.out.printf("%-17s: %.2f%%%n", 
                      "Discount ratio ", discount);
        price -= Math.round(discount * price) / 100.0;
        System.out.printf("%-17s: %.2f%n", "Price before tax", price);
        System.out.println("---------------------------");
        
        // Print taxes and final price
        fedTax = Math.round(FEDERAL_TAX * price) / 100.0;
        provTax = Math.round(PROVINCIAL_TAX * price) / 100.0;
        finalPrice = price + provTax + fedTax;
        System.out.printf("%-17s: %.2f%n", "Federal Tax ", fedTax);
        System.out.printf("%-17s: %.2f%n", "Provincial Tax ", provTax);
        System.out.printf("%-17s: %.2f%n", "Final Price ", finalPrice);
    }
    
}
