package com.example.icouna.ui.products;

public class Product {
    private int image;
    private String title, text;


    public Product(int image, String title, String text) {
        this.image = image;
        this.title = title;
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}

