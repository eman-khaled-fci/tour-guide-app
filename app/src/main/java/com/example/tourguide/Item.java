package com.example.tourguide;

public class Item {
    private int image;
    private String description;

    public Item(int image, String description) {
        this.image = image;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }
}
