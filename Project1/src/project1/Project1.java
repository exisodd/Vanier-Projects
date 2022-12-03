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
        ArrayList<Book> list = new ArrayList<>();
        Book myBook = new Book("How to speak chinese", "your name", 9.99, "To be confirmed", "978-4-6978-9706-6");
        Book book2 = new Book("Book 2", "More stuff", 0, "To be confirmed", "978-4-6978-9706-6");
        list.add(myBook);
        list.add(book2);

        ArrayList<Book> list2 = new ArrayList<>();
        Book book1 = new Book("like", "stuff like how", 0, "To be confirmed", "978-4-6978-9706-6");
        Book book3 = new Book("Book 2", "More stuff", 0, "To be confirmed", "978-4-6978-9706-6");
        list2.add(book1);
        list2.add(book3);

        Library library = new Library(list);
        Library library2 = new Library(library);
        list.add(book1);
        System.out.println(library);
        ArrayList<Book> searchedList = library.searchBook("How");
        System.out.println(searchedList);
    }
    
}
