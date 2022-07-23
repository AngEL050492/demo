package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Catalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int size;
    private int price;
    private String color;
    private String brand;
    private int articleNumber;


    public Catalog() {
    }

    public Catalog(int id, String name, int size, int price, String color, String brand, int articleNumber) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.price = price;
        this.color = color;
        this.brand = brand;
        this.articleNumber = articleNumber;
    }

    public Catalog(String name, int size, int price, String color, String brand, int articleNumber) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.color = color;
        this.brand = brand;
        this.articleNumber = articleNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(int articleNumber) {
        this.articleNumber = articleNumber;
    }
}
