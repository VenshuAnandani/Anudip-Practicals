class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorcycle started.");
    }
}

class Garage {
    void serviceVehicle(Vehicle vehicle) {
        vehicle.start();
        System.out.println("Vehicle serviced.");
    }
}

public class VehiclePolymorphism {
    public static void main(String[] args) {
        Vehicle v = new Car();
        Garage garage = new Garage();
        garage.serviceVehicle(v);

        v = new Motorcycle();
        garage.serviceVehicle(v);
    }
}