package com.kodilla.testing.library;

import java.util.Objects;

public class Book {
    private String author;
    private String title;
    private int publicationYear;

    public Book(String author, String title, int publicYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publicYear=" + publicationYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear &&
                Objects.equals(author, book.author) &&
                Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {

        return Objects.hash(author, title, publicationYear);
    }
}
