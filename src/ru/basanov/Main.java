package ru.basanov;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        Person person = new Person.Builder().addFirstName("Mingiyan").addLastName("Basanov").addAge(32).build();
        // Задание 3
        Figure circle = new Circle(2);
        Figure delta = new Delta(3, 5);
        Figure square = new Square(2, 6);
        System.out.println("Площадь круга = " + circle.area());
        System.out.println("Площадь треугольника = " + delta.area());
        System.out.println("Площадь квадрат = " + square.area());
    }
}
