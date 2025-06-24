import java.util.Scanner;

public class switchcaseexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the button number (1 - 3): ");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Good Morning");
                break;
            default:
                System.out.println("Bonjour");
                break;
        }

        sc.close();
    }
}
