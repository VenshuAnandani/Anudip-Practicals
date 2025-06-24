import java.util.Scanner;

public class scannerexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        System.out.println("Input number is: " + n);
        
        sc.close();
    }
}
