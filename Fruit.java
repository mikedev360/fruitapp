package com.example.fruitshealth;

public class Fruit {
    public Fruit(String name, int callories, int imageId) {
        this.name = name;
        this.callories = callories;
        this.imageId = imageId;
    }

    String name;
    int callories;
    int imageId;

    public void setName(String name) {
        this.name = name;
    }

    public void setCallories(int callories) {
        this.callories = callories;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getCallories() {
        return callories;
    }

    public int getImageId() {
        return imageId;
    }
}
