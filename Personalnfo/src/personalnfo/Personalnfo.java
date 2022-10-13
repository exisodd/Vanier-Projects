/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personalnfo;
import java.util.Scanner;

/**
 *
 * @author Ethan Tran
 */
public class Personalnfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create scanner object to get input
        Scanner GetInput = new Scanner(System.in);
        
        // Initialize variables
        String name, age, gender, department;
        Double pi;
        
        // Get input for name, age, gender, and department
        System.out.print("Please enter your name: ");
        name = GetInput.nextLine();
        System.out.print("Please enter your age: ");
        age = GetInput.nextLine();
        System.out.print("Please enter your gender: ");
        gender = GetInput.nextLine();
        System.out.print("Please enter your department: ");
        department = GetInput.nextLine();
        System.out.print("Please enter the value of PI (3.1415926): ");
        pi = GetInput.nextDouble();
        
        // Print personal information left-justified
        System.out.println("");
        System.out.printf("%-11s: %s%n", "Name ", name);
        System.out.printf("%-11s: %s%n", "Age ", age);
        System.out.printf("%-11s: %s%n", "Gender ", gender);
        System.out.printf("%-11s: %s%n","Department ",department);
        System.out.printf("%-11s: %.2f%n", "PI ", pi);
    }
    
}
