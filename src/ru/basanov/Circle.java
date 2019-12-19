package ru.basanov;

public class Circle implements Figure {

    private int radius;

    @Override
    public int area() {
        return (int) (this.radius * 2 * 3.14);
    }

    public Circle(int radius) {
        this.radius = radius;
    }
}
