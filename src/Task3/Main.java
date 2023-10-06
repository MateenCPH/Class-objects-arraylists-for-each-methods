package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookInventory = new ArrayList<>();
        Book book1 = new Book("Krigskunsten", "San Tzu", 2015);
        Book book2 = new Book("Shadow Aarmy", "Thomas Rathsack", 2011);
        Book book3 = new Book("Jæger - i krig med eliten", "Thomas Rathsack", 2009);

        addBooks(bookInventory, book1);
        addBooks(bookInventory, book2); //vi bruger metoden addBooks til at tilføje objekter af datatypen Book
        addBooks(bookInventory, book3); //til vores arrayliste 'bookInventory'

        displayBooks(bookInventory);    //vi bruger metoden 'displayBooks' til at printe alle bøger i output

        findBooksPublishedBeforeYear(bookInventory,2010);   //vi bruger metoden 'findBooksPub... til at printe
    }                                      //alle bøger der er udgivet før det angivne årstal i parameteren

    public static void addBooks(ArrayList<Book> bookInventory, Book book) {
        bookInventory.add(book);    //Metode der hjælper med at tilføje objekter af typen 'Book' til vores arrayliste
    }                               //'bookInventory'

    public static void displayBooks(ArrayList<Book> bookInventory) {
        for (Book book : bookInventory) {
            //(for hver book af datatypen Book : i vores arrayliste 'bookInventory)
            System.out.println(book);
        }
    }

    public static void findBooksPublishedBeforeYear(ArrayList<Book> bookInventory, int year) {
        for (Book book : bookInventory) {
            //(for hver book af datatypen Book : i vores arrayliste 'bookInventory)
            if (book.getPublicationYear() < year) {
                //hvis book's publicationyear er mindre end det angivne year i parameteren
                System.out.println("This/these book(s) were published before year " + year + ": " + book);//så gør dette
            }
        }

    }
}