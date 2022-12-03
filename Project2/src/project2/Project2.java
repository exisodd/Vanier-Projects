/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project2;

/**
 *
 * @author Ethan
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Dish myDish1 = new Dish("Fried Chicken", 'x', 20, true);
        Dish myDish2 = new Dish("Fried Chicken", 'x', 20, true);
        Beverage myBev1 = new Beverage("Diet Coke", 2, 500);
        Beverage myBev2 = new Beverage("Diet Coke", 2, 500);
        Customer customer1 = new Customer("John", 2, 230);
        Customer customer2 = new Customer("John", 0, 220);
        Bill myBill1 = new Bill(myDish1, myBev1, customer1);
        Bill myBill2 = new Bill(myDish2, myBev2, customer2);
        System.out.println(myBill1);
    }
    
}
