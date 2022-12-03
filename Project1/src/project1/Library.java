package project1;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public Library(Library library) {
        // TODO Deep copy or shallow copy of the arraylist?
        books = library.books;
    }

    public ArrayList<Book> searchBook(String keyword) {
        // TODO Should search book be case insensitive?
        ArrayList<Book> result = new ArrayList<>();
        for (Book book: books) {
            if (book.getAuthor().contains(keyword) || book.getTitle().contains(keyword)) {
                result.add(book);
            }
        }
        return result;
    }

    public boolean equals(Library library) {
        // Check if arraylists are of equal length
        if (books.size() != library.books.size()) {
            return false;
        }

        // If so, validate equality of each book
        for (int i = 0; i < books.size(); i++) {
            if (!books.get(i).equals(library.books.get(i))) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Book book: books) {
            result.append(book.toString()).append("===============================\n");
        }
        return result.toString();
    }

}
