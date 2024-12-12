abstract class Vehicle {
    String name;

    abstract void startEngine();

    abstract void run();
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Vehicle " + name + " Start Engine");
    }

    @Override
    void run() {
        System.out.println("Vehicle " + name + " Run");
    }
}

class motorCycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Vehicle " + name + " Start Engine");
    }

    @Override
    void run() {
        System.out.println("Vehicle " + name + " Run");
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.name = "Car";
        vehicle.startEngine();
        vehicle.run();
    }
}