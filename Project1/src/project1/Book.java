package project1;

public class Book {

    private String title;
    private String author;
    private double price;
    private String publisher;
    private String isbn;

    public Book() {
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
        return -1;
    }

    public void toTitleCase() {
        String finalAuthor = "";
        String finalTitle = "";

        // Convert each word in author to title case
        for (String word: author.split(" ")) {
            finalAuthor += Character.toTitleCase(word.charAt(0)) +
                           word.substring(1).toLowerCase();
        }

        // Convert each word in title to title case
        for (String word: title.split(" ")) {
            finalTitle += Character.toTitleCase(word.charAt(0)) +
                    word.substring(1).toLowerCase();
        }
    }

    @Override
    public String toString() {
        return String.format("%-12s: %s\n", "Title", title) +
               String.format("%-12s: %s\n", "Author", author) +
               String.format("%-12s: %.2f\n", "Price", price) +
               String.format("%-12s: %s\n", "Publisher", publisher) +
               String.format("%-12s: %s\n", "ISBN", isbn);
    }
}
