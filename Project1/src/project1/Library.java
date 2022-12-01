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

    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        Book myBook = new Book("My jeff", "stuff like f", 0, "To be confirmed", "978-4-6978-9706-6");
        Book book2 = new Book("Book 2", "More stuff", 0, "To be confirmed", "978-4-6978-9706-6");
        list.add(myBook);
        list.add(book2);

        ArrayList<Book> list2 = new ArrayList<>();
        Book book1 = new Book("My jeff", "stuff like f", 0, "To be confirmed", "978-4-6978-9706-6");
        Book book3 = new Book("Book 2", "More stuff", 0, "To be confirmed", "978-4-6978-9706-6");
        list2.add(book1);
        list2.add(book3);

        Library library = new Library(list);
        Library library2 = new Library(list2);
        System.out.println(library.equals(library2));
    }
}
