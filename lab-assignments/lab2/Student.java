public class Student {
    private String name;
    private int age;
    private String department;

    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args) {
        Student student = new Student("Venshu Anandani", 20, "Computer Engineering");

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Department: " + student.getDepartment());

        student.setName("Pratik Kolhe");
        student.setAge(20);
        student.setDepartment("Computer Science (AI and DS)");

        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated Age: " + student.getAge());
        System.out.println("Updated Department: " + student.getDepartment());
    }
}