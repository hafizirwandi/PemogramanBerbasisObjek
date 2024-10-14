class Car {
    private String merek, nama;
    // String merek, nama;

    void display() {
        System.out.println("Merek : " + merek);
        System.out.println("Nama : " + nama);
    }

    // setter
    void setMerek(String merek) {
        this.merek = merek;
    }

    // getter
    String getMerek() {
        return merek;
    }

}

public class PrivateModifierCar {
    public static void main(String[] args) {
        Car car = new Car();
        // car.merek = "Toyota";
        // car.nama = "Avanza";
        car.setMerek("Toyota");
        // car.display();

        // System.out.println("Nama merek mobil adalah " + car.merek);
        System.out.println("Nama merek mobil adalah " + car.getMerek());
    }
}
