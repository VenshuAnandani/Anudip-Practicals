class Vehicle {
    String make;
    String model;
    int year;
    int maximumSpeed;

    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    public void drive(){}
}

class Car extends Vehicle {
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make + " " + model + " Car is driving");
    }
}

class Bike extends Vehicle {
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving");
    }
}

public abstract class VehicleInheritance {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Fortuner", 2024, 190);
        Bike bike = new Bike("Honda", "CBR", 2021, 300);

        System.out.println("Car: " + car.make + " " + car.model + ", Year: " + car.year + ", Max Speed: " + car.maximumSpeed);
        car.drive();

        System.out.println("Bike: " + bike.make + " " + bike.model + ", Year: " + bike.year + ", Max Speed: " + bike.maximumSpeed);
        bike.drive();
    }
}