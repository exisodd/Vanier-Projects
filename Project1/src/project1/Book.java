package project1;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private double price;
    private String publisher;
    private String isbn;

    public Book() {
        // TODO ??EMPTY MEMBERS OR FILLED NO_TITLE???
        title = "";
        author = "";
        price = 0;
        publisher = "";
        isbn = "";
    }

    public Book(String title) {
        this.title = title;
        this.author = "";
        this.price = 0;
        this.publisher = "";
        this.isbn = "";
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
        int length = isbn.replace("-", "").length();
        int result = -1;
        if (length == 10 && isbn.charAt(1) == '-' &&
            isbn.charAt(6) == '-' && isbn.charAt(11) == '-') {
            result = 0;
        } else if (length == 13 && isbn.charAt(3) == '-' &&
                   isbn.charAt(5) == '-' && isbn.charAt(10) == '-' &&
                   isbn.charAt(15) == '-') {
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
                       .append(word.substring(1).toLowerCase());
        }

        // Convert each word in title to title case
        for (String word: title.split(" ")) {
            finalTitle.append(Character.toTitleCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase());
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
}
