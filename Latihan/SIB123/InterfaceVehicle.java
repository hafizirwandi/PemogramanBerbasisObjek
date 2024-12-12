interface Vehicle {
    void startEngine();

    void startEngine2();
}

interface Vehicle2 {

}

class Car implements Vehicle, Vehicle2 {

    @Override
    public void startEngine() {
        System.out.println("Car Start Engine");
    }

    @Override
    public void startEngine2() {
        System.out.println("Car Start Engine2");
    }
}

public class InterfaceVehicle {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.startEngine2();
    }
}
