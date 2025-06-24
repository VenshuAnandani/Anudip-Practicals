import java.util.Scanner;

public class task5 {
    public int add() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        return a + b;
    }

    public static void main(String[] args) {
        task5 obj = new task5();
        int result = obj.add();
        System.out.println("The sum is: " + result);
    }
}
