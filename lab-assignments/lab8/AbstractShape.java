import java.util.Scanner;

abstract class Shape {
    public void getArea() {}
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println("Area of circle: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    private int length;
    private int breadth;
    
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    @Override
    public void getArea() {
        System.out.println("Area of rectangle: " + (length * breadth));
    }
}

public class AbstractShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius of circle: ");
        int rad = sc.nextInt();
        Circle circle = new Circle(rad);
        circle.getArea();
        
        System.out.print("Enter the length of rectangle: ");
        int len = sc.nextInt();
        System.out.print("Enter the breadth of rectangle: ");
        int bre = sc.nextInt();
        Rectangle rectangle = new Rectangle(len, bre);
        rectangle.getArea();

        sc.close();
    }
}