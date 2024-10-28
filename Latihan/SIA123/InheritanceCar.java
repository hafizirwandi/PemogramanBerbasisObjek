class Vehicle {
    public void startEngine() {
        System.out.println("Engine Start");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving");
    }
}

class SportCar extends Car {
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Sport Car Engine Start");
    }
}

public class InheritanceCar {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.startEngine();

        SportCar sportcar = new SportCar();
        sportcar.startEngine();
        sportcar.drive();

    }
}
