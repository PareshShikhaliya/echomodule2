package org.example.class3;

import java.util.ArrayList;
import java.util.List;

// Book class
class Book {
    private String title;
    private int publicationYear;
    // Other book properties and methods

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}

// Author class
class Author {
    private String name;
    private List<Book> booksAuthored;

    public Author(String name)
    {
        this.name = name;
        booksAuthored = new ArrayList<>();
    }

    public void addBook(Book book) {
        booksAuthored.add(book);
    }

    public List<Book> getBooksAuthored() {
        return booksAuthored;
    }

    public String getName() {
        return name;
    }
}

public class AssociationExample6 {
    public static void main(String[] args) {
        Author author1 = new Author("John Doe");
        Author author2 = new Author("Jane Smith");

        Book book1 = new Book("Java Programming", 2020);
        Book book2 = new Book("Python Basics", 2018);

        author1.addBook(book1);
        author1.addBook(book2);
        author2.addBook(book2);

        // Display books authored by each author
        System.out.println(author1.getName() + "'s Books:");
        for (Book book : author1.getBooksAuthored()) {
            System.out.println(book.getTitle() + " (" + book.getPublicationYear() + ")");
        }

        System.out.println();

        System.out.println(author2.getName() + "'s Books:");
        for (Book book : author2.getBooksAuthored()) {
            System.out.println(book.getTitle() + " (" + book.getPublicationYear() + ")");
        }
    }
}
