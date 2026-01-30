public class Practical18 {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        System.out.println("--- Car Details ---");
        System.out.println("Fuel: " + car.fuelType());
        System.out.println("Wheels: " + car.noOfWheels());

        System.out.println("\n--- Bike Details ---");
        System.out.println("Fuel: " + bike.fuelType());
        System.out.println("Wheels: " + bike.noOfWheels());
    }
}

abstract class Vehicle {
    abstract String fuelType();

    abstract int noOfWheels();
}

class Car extends Vehicle {
    String fuelType() {
        return "Petrol/Diesel";
    }

    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {
    String fuelType() {
        return "Petrol";
    }

    int noOfWheels() {
        return 2;
    }
}
