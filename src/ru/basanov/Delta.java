package ru.basanov;

public class Delta implements Figure{

    private int base;

    private int height;

    public Delta(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public int area() {
        return this.base * this.height / 2;
    }
}
