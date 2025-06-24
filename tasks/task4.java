import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.print("Even numbers: ");
        for (int i = 0; i < 5; i++) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i] + "\t");
            }
        }
        System.out.println();

        System.out.print("Odd numbers: ");
        for (int i = 0; i < 5; i++) {
            if (nums[i] % 2 != 0) {
                System.out.print(nums[i] + "\t");
            }
        }

        sc.close();
    }
}
