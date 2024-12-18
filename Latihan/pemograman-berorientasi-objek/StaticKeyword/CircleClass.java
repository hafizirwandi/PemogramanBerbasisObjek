package StaticKeyword;

class Circle {
    private static final double PI = 3.14159; // Konstanta kelas
    private final double radius; // Variabel final

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {

        return PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }
}

public class CircleClass {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Luas lingkaran: " + circle.getArea());
        System.out.println("Keliling lingkaran: " + circle.getCircumference());
    }
}