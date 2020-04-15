package com.example.helloworld;

import java.util.Date;

public class Book {
    private String name;
    private Author author;
    private Double price;
    private Boolean ispublic;
    private Date date;

    @Override
    public String toString() {
        return "Book{" +
                "name = '" + name + "\'" +
                ",author = '" + author + "\'" +
                ",price = " + price +
                ", ispublic = " + ispublic +
                ", date = " + date +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getIspublic() {
        return ispublic;
    }

    public void setIspublic(Boolean ispublic) {
        this.ispublic = ispublic;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}


