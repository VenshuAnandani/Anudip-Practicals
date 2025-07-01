class Student {
    String name;
    int age;
    String department;

    // Default constructor
    Student() {
        this.name = "Unknown";
        this.age = 20;
        this.department = "Unassigned";
    }

    // Constructor with name and age
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }

    // Constructor with name, age, and department
    Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }
}

public class StudentPolymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Sameer", 21);
        Student s3 = new Student("Saniya", 22, "CE");

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
    }
}