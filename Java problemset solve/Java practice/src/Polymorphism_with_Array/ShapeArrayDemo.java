package Polymorphism_with_Array;

class Shape {
    void calculateArea() {
        System.out.println("Calculating area.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = 3.1416 * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    void calculateArea() {
        double area = side * side;
        System.out.println("Square Area: " + area);
    }
}

public class ShapeArrayDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(10, 6);
        shapes[2] = new Square(4);

        for (Shape shape : shapes) {
            shape.calculateArea();
        }
    }
}