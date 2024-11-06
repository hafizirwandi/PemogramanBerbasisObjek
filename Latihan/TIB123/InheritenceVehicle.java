class Vehicle {
    String name;

    void startEngine() {
        System.out.println(name + " Vehicle Start Engine");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car Drive");
    }

    @Override
    void startEngine() {
        System.out.println("Car Start Engine");
    }
}

public class InheritenceVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.name = "Mobil";

        vehicle.startEngine();
        Car car = new Car();
        car.name = "Toyota";
        car.startEngine();
        car.drive();

    }
}
