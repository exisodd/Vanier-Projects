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
        ArrayList<Book> bookList = new ArrayList<>();
        Book myBook1 = new Book("How to speak chinese", "your name",
                9.99, "Warner brothers", "0-7291-9466-3");
        Book myBook2 = new Book("Funny tunes", "jerry stewart",
                12.99, "To be confirmed", "978-4-2513-9706-6");

        try {
            myBook1.setPrice(-2);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        bookList.add(myBook1);
        bookList.add(myBook2);

        Library myLibrary = new Library(bookList);
        System.out.println(myLibrary);
    }
    
}
