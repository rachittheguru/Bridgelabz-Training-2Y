package library.books;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private String isbn;
    private String category;
    private boolean isAvailable;
    
    public Book(String bookId, String title, String author, String isbn, String category) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.category = category;
        this.isAvailable = true;
    }
    
    public void displayBookDetails() {
        System.out.println("=== Book Details ===");
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Category: " + category);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println();
    }
    
    public static Book addNewBook(String bookId, String title, String author, String isbn, String category) {
        System.out.println("Adding new book to library...");
        Book newBook = new Book(bookId, title, author, isbn, category);
        System.out.println("Book '" + title + "' by " + author + " has been added successfully!");
        return newBook;
    }
    
    public boolean isBookAvailable() {
        return isAvailable;
    }
    
    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book '" + title + "' has been issued.");
        } else {
            System.out.println("Book '" + title + "' is not available for issue.");
        }
    }
    
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book '" + title + "' has been returned.");
        } else {
            System.out.println("Book '" + title + "' is already available.");
        }
    }
    
    public String getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public String getCategory() { return category; }
    public boolean getIsAvailable() { return isAvailable; }
}
