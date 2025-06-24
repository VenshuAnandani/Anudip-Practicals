import java.util.Scanner;

public class findprime {
    public void isprime(int n) {
        int i, m = n / 2, flag = 0;

        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number.");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a prime number.");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is a prime number.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int n = sc.nextInt();

        findprime fp = new findprime();
        fp.isprime(n);

        sc.close();
    }
}