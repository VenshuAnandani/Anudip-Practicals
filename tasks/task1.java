import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, sum, sub;

        System.out.println("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a + b;
        sub = a - b;

        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + sub);
        sc.close();
    }
}
