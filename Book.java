package LibraryManagement;
 public class Book {
    private String title;
    private String author;
    private String isbn;
    public Book(String title, String author, String isbn) 
  {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getISBN() {
        return isbn;
    }
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author    : " + author);
        System.out.println("ISBN      : " + isbn);
    }
 }
