package Task3;

public class Book {

    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String toString() {
        return "Task3.Book title: " + title + ". Task3.Book author: " + author + ". Task3.Book publication year: " + publicationYear;
    }



}
