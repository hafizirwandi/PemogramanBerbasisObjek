interface Vehicle {
    void startEngine(); // Metode abstrak

    default void run() {
        System.out.println("Run");
    }
}

class Car implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Engine started!");
    }
}

public class InterfaceClass {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine();
        car.run();
    }
}
