import java.util.Scanner;

class Shape {
    public double getArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}

public class ShapeInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius of circle: ");
        int rad = sc.nextInt();
        Circle circle = new Circle(rad);
        System.out.println("Circle Area: " + circle.getArea());
        
        System.out.print("Enter the length of square: ");
        int len = sc.nextInt();
        Square square = new Square(len);
        System.out.println("Square Area: " + square.getArea());

        sc.close();
    }
}