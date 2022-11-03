/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _testapplication;


import java.util.Scanner;

/**
 *
 * @author Ethan
 */
public class _TestApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Please enter num: ");
        int num = console.nextInt();
        console.nextLine();
        System.out.print("Please enter num: ");
        int num1 = console.nextInt();

        int max = 1;
        for (int i = 1; i < Math.max(num, num1); i++) {
            if (num % i == 0 && num1 % i == 0) {
                max = i;
            }
        }
        System.out.println(max);

    }
}
