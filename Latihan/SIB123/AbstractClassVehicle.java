abstract class Vehicle {
    void startEngine() {
        System.out.println("Vehicle start engine");
    }

    abstract void merek();
}

class Car extends Vehicle {
    @Override
    void merek() {
        System.out.println("Car merek");
    }
}

class MotorCycle extends Vehicle {
    @Override
    void merek() {
        System.out.println("MotorCycle merek");
    }
}

public class AbstractClassVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.startEngine();
        vehicle.merek();

        Vehicle motor = new MotorCycle();
        motor.startEngine();
        motor.merek();
    }
}
