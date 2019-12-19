package ru.basanov;

public class Square implements Figure{

    private int height;

    private int width;

    public Square(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int area() {
        return this.height * this.width;
    }
}
