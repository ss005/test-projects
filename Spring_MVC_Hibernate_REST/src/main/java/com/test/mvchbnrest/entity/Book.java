package com.test.mvchbnrest.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name = "Book")
@XmlRootElement
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String author;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "bookDetailsId")
    private BookDetails bookDetails;

    //Getter and Setter methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookDetails getBookDetails() {
        return bookDetails;
    }

    public void setBookDetails(BookDetails bookDetails) {
        this.bookDetails = bookDetails;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", bookDetails=" + bookDetails +
                '}';
    }
}