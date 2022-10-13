/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package webadressextractor;

import java.util.Scanner;

/**
 * @author Ethan Tran
 */
public class WebAdressExtractor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create scanner instance
        Scanner GetInput = new Scanner(System.in);

        // Get input
        System.out.print("Please input a web address: ");
        String address = GetInput.nextLine().toLowerCase();
        String[] addressArr = address.split("\\.");
        String[] addressParts = {"Heading ", "Company", "Extension"};

        // Print results
        System.out.printf("%-10s: %s%n", "Address", address);
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-10s: %s%n", addressParts[i], addressArr[i]);
        }

    }

}
