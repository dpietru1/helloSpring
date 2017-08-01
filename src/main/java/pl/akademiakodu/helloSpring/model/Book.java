package pl.akademiakodu.helloSpring.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by slickender on 27.07.2017.
 */
public class Book {
    private String title;
    private String author;
    private Double price;

    public Book() {
    }

    public Book(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price;
    }
}

