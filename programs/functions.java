public class functions {
    public static void main(String[] args) {
        functions obj = new functions();
        obj.disp();
        int result = obj.add(5, 10);
        System.out.println("The sum is: " + result);
    }

    public int add (int a, int b) {
        return a + b;
    }

    public void disp () {
        System.out.println("This is a function that prints a message.");
    }
}
