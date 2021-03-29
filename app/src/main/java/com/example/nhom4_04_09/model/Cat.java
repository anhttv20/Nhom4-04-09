package com.example.nhom4_04_09.model;

public class Cat {
    private int sourceImg;
    private String name;

    public Cat() {
    }

    public Cat(int sourceImg, String name) {
        this.sourceImg = sourceImg;
        this.name = name;
    }

    public int getSourceImg() {
        return sourceImg;
    }

    public void setSourceImg(int sourceImg) {
        this.sourceImg = sourceImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
