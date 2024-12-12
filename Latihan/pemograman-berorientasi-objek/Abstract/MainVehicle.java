// Abstract class Vehicle
abstract class Vehicle {
    protected String brand;

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method - tidak memiliki body atau implementasi
    public abstract void startEngine();

    // Method non-abstrak - memiliki implementasi
    public void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Subclass Car yang mewarisi Vehicle
class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    // Override dan implementasi method abstract startEngine
    @Override
    public void startEngine() {
        System.out.println("The car's engine starts with a key.");
    }
}

// Subclass Motorcycle yang mewarisi Vehicle
class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        super(brand);
    }

    // Override dan implementasi method abstract startEngine
    @Override
    public void startEngine() {
        System.out.println("The motorcycle's engine starts with a button.");
    }
}

// Kelas utama untuk menjalankan program
public class MainVehicle {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        Vehicle motorcycle = new Motorcycle("Honda");

        car.showBrand();
        car.startEngine();

        motorcycle.showBrand();
        motorcycle.startEngine();
    }
}
