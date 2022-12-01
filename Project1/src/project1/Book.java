package project1;

import java.util.Arrays;
import java.util.List;

public class Book {

    private String title;
    private String author;
    private double price;
    private String publisher;
    private String isbn;

    public Book() {
        // TODO ??EMPTY MEMBERS OR FILLED NO_TITLE???
        title = "";
        author = "Unknown";
        price = 0;
        publisher = "To be confirmed";
        isbn = "0-1234-5678-9";
    }

    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.price = 0;
        this.publisher = "To be confirmed";
        this.isbn = "0-1234-5678-9";
    }

    public Book(String title, String author, double price, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public Book(Book book) {
        title = book.title;
        author = book.author;
        price = book.price;
        publisher = book.publisher;
        isbn = book.isbn;
    }

    public int checkIsbnStatus() {
        int length = isbn.length();
        int result = -1;
        List<Integer> dash10 = Arrays.asList(1, 6, 11);
        List<Integer> dash13 = Arrays.asList(3, 5, 10, 15);

        // Validate 10-digit isbn
        if (length == 13) {
            // Validate digit validity
            for (int i = 0; i < length; i++) {
                // Char not digit, so check if dash and proper index location
                if (!Character.isDigit(isbn.charAt(i))) {
                    if (isbn.charAt(i) != '-') {
                        return -1;
                    }
                    if (!dash10.contains(i)) {
                        return -1;
                    }
                }
            }
            result = 0;
        // Validate 13-digit isbn
        } else if (length == 17) {
            // Validate digit validity
            for (int i = 0; i < length; i++) {
                // Char not digit, so check if dash and proper index location
                if (!Character.isDigit(isbn.charAt(i))) {
                    if (isbn.charAt(i) != '-') {
                        return -1;
                    }
                    if (!dash13.contains(i)) {
                        return -1;
                    }
                }
            }
            result = 1;
        }

        return result;
    }

    public void toTitleCase() {
        // TODO ????Return value or update members????
        // Create StringBuilder objects to store new string
        StringBuilder finalAuthor = new StringBuilder();
        StringBuilder finalTitle = new StringBuilder();

        // Convert each word in author to title case
        for (String word: author.split(" ")) {
            finalAuthor.append(Character.toTitleCase(word.charAt(0)))
                       .append(word.substring(1).toLowerCase())
                       .append(" ");
        }

        // Convert each word in title to title case
        for (String word: title.split(" ")) {
            finalTitle.append(Character.toTitleCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
        }

        // Update data members
        author = finalAuthor.toString();
        title = finalTitle.toString();
    }

    @Override
    public String toString() {
        return String.format("%-12s: %s\n", "Title", title) +
               String.format("%-12s: %s\n", "Author", author) +
               String.format("%-12s: %.2f\n", "Price", price) +
               String.format("%-12s: %s\n", "Publisher", publisher) +
               String.format("%-12s: %s\n", "ISBN", isbn);
    }

    public boolean equals(Book book) {
        return book.title.equals(title) &&
               book.author.equals(author) &&
               book.publisher.equals(publisher) &&
               book.isbn.equals(isbn) &&
               book.price == price;
    }

    public Book clone() {
        return new Book(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public static void main(String[] args) {
        Book myBook = new Book("My l i jeff", "stuff like f", 0, "To be confirmed", "978-4-6978-9706-6");
        myBook.toTitleCase();
        System.out.println(myBook.toString());
    }
}
