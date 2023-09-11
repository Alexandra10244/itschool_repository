package session11.abstractionpractice;

public abstract class Shape {

    private String name = "some shape name";

    abstract double area();

    abstract double perimeter();

    String getShapeName() {
        return "shape";
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {

    private double lenght, width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    double area() {
        return lenght * width;
    }

    @Override
    double perimeter() {
        return 2 * (lenght + width);
    }
}
