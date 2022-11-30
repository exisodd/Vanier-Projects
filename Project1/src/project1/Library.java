package project1;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public Library(Library library) {
        books = library.books;
    }

    public ArrayList<Book> searchBook(String keyword) {
        ArrayList<Book> result = new ArrayList<Book>();
        for (Book book: books) {
            if (book.getAuthor().contains(keyword) || book.getTitle().contains(keyword)) {
                result.add(book);
            }
        }
        return result;
    }

    public boolean equals(Library library) {
        return library.books.equals(books);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Book book: books) {
            result.append(books.toString());
        }
        return result.toString();
    }
}
