import java.util.Scanner;

public class task6 {

    public void countDigits () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
        sc.close();
    }

    public void palindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        sc.close();
    }

    public void reverseNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        System.out.println("Reversed number: " + reversed);
        sc.close();
    }

    public static void main(String[] args) {
        task6 t = new task6();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Count digits in a number");
        System.out.println("2. Check if a string is a palindrome");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                t.countDigits();
                break;
            case 2:
                t.palindrome();
                break;
            case 3:
                t.reverseNumber();
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }
}