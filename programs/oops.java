class pen {
    String color;
    String type;

    public pen(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public void write() {
        System.out.println("Writing with " + type + " pen of color " + color);
    }
}

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int sId;
    
    public Student(String name, int age, int sId) {
        super(name, age);
        this.sId = sId;
    }
    
    public Student(Student sh) {
        super(sh.name, sh.age);
        this.sId = sh.sId;
    }
    
        public void display(){
            System.out.println("Student ID: " + sId + ", Name: " + name + ", Age: " + age);
        }
}

public class oops {
    public static void main(String[] args) {
        pen p1 = new pen("blue", "ball-point");
        p1.write();
        pen p2 = new pen("red", "gel");
        p2.write();

        Student s1 = new Student("Alice", 20, 101);
        s1.display();
        Student s2 = new Student(s1);
        s2.display();
        
        Person p = new Student("Bob", 22, 102);
        if (p instanceof Student) {
            ((Student) p).display();
        }
    }
}