import java.util.Scanner;

public class Armstrong {
    public static void printArmstrongNumber(int start, int end) {
        System.out.print("Armstrong numbers between " + start + " and " + end + ": ");
        for (int num = start; num <= end; num++) {
            int original = num, sum = 0, digits = 0, temp = num;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                int cube = 1;
                for (int i = 0; i < digits; i++) {
                    cube *= digit;
                }
                sum += cube;
                temp /= 10;
            }

            if (sum == original) {
                System.out.print(original + "\t");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter start of range: ");
        int start = scanner.nextInt();
        System.out.print("Enter end of range: ");
        int end = scanner.nextInt();

        printArmstrongNumber(start, end);
        scanner.close();
    }
}