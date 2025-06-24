import java.util.Scanner;

abstract class Payment {
    abstract void process_payment(double a);
}

class cardpayment extends Payment {
    @Override
    void process_payment(double a) {
        System.out.println("paid by card" + a);
    }
}

class UPIpayment extends Payment {
    @Override
    void process_payment(double a) {
        System.out.println("paid by UPI" + a);
    }

}

public class PayJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        Payment c = new cardpayment();
        Payment u = new UPIpayment();
        c.process_payment(a);
        u.process_payment(a);
        sc.close();

    }
}