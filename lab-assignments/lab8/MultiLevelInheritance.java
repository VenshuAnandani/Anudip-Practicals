import java.util.Scanner;

class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Dog {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the type of animal (dog/cat): ");
        String type = sc.nextLine().toLowerCase();
        
        Animal animal;
        if (type.equals("dog")) {
            animal = new Dog();
        } else if (type.equals("cat")) {
            animal = new Cat();
        } else {
            System.out.println("Unknown animal type.");
            sc.close();
            return;
        }
        
        animal.makeSound();
        sc.close();
    }
}