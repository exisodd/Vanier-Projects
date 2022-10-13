/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parkingpricecalculator;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Ethan
 */
public class ParkingPriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create scanner instance
        Scanner GetInput = new Scanner(System.in);

        // Get input
        System.out.print("Please input the number of minutes your car has parked: ");
        double minutes = GetInput.nextDouble();
        double hours = Math.ceil(minutes / 60);
        double price = hours * 2;

        // Print results
        System.out.printf("%-23s: %.0f%n", "Parking time (minutes)", minutes);
        System.out.printf("%-23s: %.0f%n", "Parking time (hours)", hours);
        System.out.printf("%-23s: %.2f", "Price", price);
    }
    
}
