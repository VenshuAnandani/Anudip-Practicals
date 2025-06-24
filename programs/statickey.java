class Student {
    String name;
    int age;
    static String college = "MGM";

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", College: " + college);
    }
}

class mathUtils {
    static int num = 16;

    public static void squrt() {
        System.out.println("Square root of " + num + ": " + Math.sqrt(num));
    }

    public static void square() {
        System.out.println("Square of " + num + ": " + (num * num));
    }
}

public class statickey {
    static {
        System.out.println("This is a static block.");
    }

    public static void main(String[] args) {
        Student student1 = new Student("Venshu", 20);
        Student student2 = new Student("Pratik", 20);

        System.out.println("Before changing college: ");
        student1.displayInfo();
        student2.displayInfo();

        Student.college = "DY Patil";
        System.out.println("After changing college: ");
        student1.displayInfo();
        student2.displayInfo();

        mathUtils.squrt();
        mathUtils.square();
    }
}