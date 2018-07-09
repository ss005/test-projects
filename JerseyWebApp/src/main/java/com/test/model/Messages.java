package com.test.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Messages {
    private int id;
    private String message ;
    private Date created ;
    private String author ;

    public Messages() {
    }

    public Messages(int id, String message, Date created, String author) {
        this.id = id;
        this.message = message;
        this.created = created;
        this.author = author;
    }

    public Messages(int id, String message, String author) {
        this.id = id;
        this.message = message;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
