class Stud {
    String name;
    int age;

    void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void setInfo(String name) {
        this.name = name;
    }
    
    void setInfo(int age) {
        this.age = age;
    }

    void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Stud {
    String subject;

    void setInfo(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    @Override
    void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        s1.setInfo("Amit", 19);
        s1.getInfo();
        s1.setInfo("Suresh");
        s1.setInfo(25);
        s1.getInfo();

        Teacher t1 = new Teacher();
        t1.setInfo("Ravi", 30, "Mathematics");
        t1.getInfo();
        t1.setInfo("Priya");
        t1.setInfo(28);
        t1.getInfo();
    }
}