package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookInventory = new ArrayList<>();
        Book book1 = new Book("Krigskunsten", "San Tzu", 2015);
        Book book2 = new Book("Shadow Aarmy", "Thomas Rathsack", 2011);
        Book book3 = new Book("Jæger - i krig med eliten", "Thomas Rathsack", 2009);

        addBooks(bookInventory, book1);
        addBooks(bookInventory, book2);
        addBooks(bookInventory, book2);

        displayBooks(bookInventory);
        findBooksPublishedBeforeYear(bookInventory,2020);
    }

    public static void addBooks(ArrayList<Book> bookInventory, Book book) {
        bookInventory.add(book);
    }

    public static void displayBooks(ArrayList<Book> bookInventory) {
        for (Book book : bookInventory) {
            System.out.println(book);
        }
    }

    public static void findBooksPublishedBeforeYear(ArrayList<Book> bookInventory, int year) {
        for (Book book : bookInventory) {
            if (book.getPublicationYear() < year) {
                System.out.println(book);
            }
        }

    }
}