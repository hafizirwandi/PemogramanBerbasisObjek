abstract class Vehicle {
    void startEngine() {
        System.out.println("Vehicle Start Engine");
    }

    abstract void stopEngine();

    abstract void isiBensin();
}

class Car extends Vehicle {
    @Override
    void stopEngine() {
        System.out.println("Car Stop Engine");
    }

    @Override
    void isiBensin() {
        System.out.println("Car Isi Bensin");
    }

}

public class AbstractClassVehicle {
    public static void main(String[] args) {
        Car vehicle = new Car();
        vehicle.startEngine();
        vehicle.stopEngine();
    }
}