public class Book {
    // Attributes
    String title;
    String author;
    String isbn;

    // Default constructor with default values
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.isbn = "0000000000";
    }

    // Extend Book class by adding parameterized constructor with title, author, isbn as parameters
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isbn = "123456789";
    }
}
