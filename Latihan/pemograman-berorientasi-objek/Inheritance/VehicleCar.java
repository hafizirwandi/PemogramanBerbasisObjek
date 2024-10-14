package Inheritance;

class Vehicle {
    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void gas() {
        System.out.println("Gas vehicle");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving.");
    }

    @Override
    public void gas() {
        super.gas();
        System.out.println("Gas car");
    }
}

class SportsCar extends Car {
    public void boostSpeed() {
        System.out.println("Boosting speed!");
    }

    @Override
    public void gas() {
        // super.gas();
        System.out.println("Gas Sportcar");
    }

}

public class VehicleCar {
    public static void main(String[] args) {
        SportsCar mySportsCar = new SportsCar();
        mySportsCar.startEngine(); // Dari Vehicle
        mySportsCar.drive(); // Dari Car
        mySportsCar.boostSpeed(); // Method milik SportsCar

        mySportsCar.gas();
    }
}
