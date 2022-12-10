/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project1;

import java.util.ArrayList;

/**
 *
 * @author Ethan
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Book> bookList1 = new ArrayList<>();
        ArrayList<Book> bookList2 = new ArrayList<>();

        Book myBook1 = new Book("How to speak chinese", "your name",
                9.99, "Warner brothers", "0-7291-9466-3");
        Book myBook2 = new Book("Funny tunes", "jerry stewart",
                3, "To be confirmed", "978-4-2513-9706-6");

        Book myBook3 = new Book("How to speak chinese", "your name",
                9.99, "Warner brothers", "0-7291-9466-3");
        Book myBook4 = new Book("Funny tunes", "jerry stewart",
                3, "To be confirmed", "978-4-2513-9706-6");

        try {
            myBook1.setPrice(-3);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        bookList1.add(myBook1);
        bookList1.add(myBook2);
        bookList2.add(myBook3);
        bookList2.add(myBook4);
        Library myLibrary1 = new Library(bookList1);
        Library myLibrary2 = new Library(bookList2);
        System.out.println(myLibrary1);
        System.out.println(myLibrary1.equals(myLibrary2));
    }
    
}
