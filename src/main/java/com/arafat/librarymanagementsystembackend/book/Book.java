package com.arafat.librarymanagementsystembackend.book;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Book {
    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_sequence"
    )
    private Long bookId;
    private String name;
    private String author;
    private LocalDate publishDate;

    public Book() {

    }

    public Book(String name, String author, LocalDate publishDate) {
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
    }

    public Book(Long bookId, String name, String author, LocalDate publishDate) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}
