package com.test.mvchbnrest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "BookDetails")
public class BookDetails {

    @Id
    @GeneratedValue
    int bookDetailsId;

    double rating;
    double price;
    StringBuffer ISBN;

    public BookDetails() {
    }

    public int getBookDetailsId() {
        return bookDetailsId;
    }

    public void setBookDetailsId(int bookDetailsId) {
        this.bookDetailsId = bookDetailsId;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public StringBuffer getISBN() {
        return ISBN;
    }

    public void setISBN(StringBuffer ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "BookDetails{" +
                "bookDetailsId=" + bookDetailsId +
                ", rating=" + rating +
                ", price=" + price +
                ", ISBN=" + ISBN +
                '}';
    }
}
