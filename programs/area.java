import java.util.Scanner;

class shape {
    public void calcArea() {
        System.out.println("Display area of rectangle");
    }
}

class Rectangle extends shape {
    Scanner sc = new Scanner(System.in);

    void display() {
        System.out.print("Enter the Length of rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of rectangle: ");
        int b = sc.nextInt();
        int area = l * b;
        System.out.println("Area is rectangle is : " + area);
    }
}

public class area {
    public static void main(String[] args) {
        Rectangle t1 = new Rectangle();
        t1.calcArea();
        t1.display();
    }
}