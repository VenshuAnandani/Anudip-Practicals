import java.util.Scanner;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        System.out.println("Addition of " + num1 + " and " + num2 + ": " + calculator.add(num1, num2));
        
        System.out.print("Enter third integer: ");
        int num3 = scanner.nextInt();

        System.out.println("Addition of " + num1 + ", " + num2 + " and " + num3 + ": " + calculator.add(num1, num2, num3));

        System.out.print("Enter first double: ");
        double num4 = scanner.nextDouble();
        System.out.print("Enter second double: ");
        double num5 = scanner.nextDouble();
        
        System.out.println("Addition of " + num4 + " and " + num5 + ": " + calculator.add(num4, num5));
    }
}