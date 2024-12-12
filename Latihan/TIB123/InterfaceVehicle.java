interface Vehicle {
    String name = "xxx";

    void startEngine();

    default void stopEngine() {
        System.out.println("Vehicle stop Engine");
    }
}

interface Human {
    static void eat() {
        System.out.println("Human eat");
    }
}

class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car Start Engine");
    }
}

interface Printer {
    void print();
}

interface Scan {
    void scan();
}

class Device implements Printer, Scan {
    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void scan() {
        System.out.println("Scan");
    }
}

public class InterfaceVehicle {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.stopEngine();

        // Human human = new Human();
        // human.eat();
        Human.eat();

        Device device = new Device();
        device.print();
        device.scan();

    }
}