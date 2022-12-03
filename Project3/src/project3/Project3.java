package project3;

import java.util.Scanner;

/**
 *
 * @author Ethan
 */
public class Project3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String answer;

        do {
            // Get loan amount
            System.out.print("Enter the loan amount: ");
            double loan = console.nextDouble();
            console.nextLine();

            // Get annual interest rate
            System.out.print("Enter the annual interest rate (in %): ");
            double interestRate = console.nextDouble();
            console.nextLine();

            // Get months of the loan
            System.out.print("Enter loan's term (in months): ");
            int months = console.nextInt();
            console.nextLine();

            // Create and initialize new Loan object
            Loan aLoan = new Loan(loan, interestRate, months);

            System.out.println(aLoan); // Loan summary report
            System.out.println(aLoan.amortize()); // Loan amortization report

            // Do another report?
            System.out.println("Would you like to run another report?\n" +
                               "Enter Y or y for yes, or any other character for no: ");
            answer = console.nextLine().toLowerCase();
        } while (answer.equals("y"));

        System.out.println("Goodbye!");
    }

}
