package FinalKeyword;

class MathUtils {
    static final double phi = 3.14;

    // void printName(final String name) {
    // System.out.println(name);
    // }

    // MathUtils(double phi) {
    // // this.phi = phi;
    // }
}

// class Parent {
// final void displayMessage() {
// System.out.println("ini display parent");
// }
// }

// class Child extends Parent {

// }

public class FinalKeyword {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        System.out.println("Nilai Phi Math saat ini " + MathUtils.phi);

        // math.phi = 4.14;
        MathUtils math2 = new MathUtils();
        System.out.println("Nilai Phi Math2 saat ini " + MathUtils.phi);

        // math.PHI = 4.14;
        // System.out.println("Nilai Phi saat ini " + math.PHI);

        // math.printName("Andi");

        // Parent child = new Child();
        // child.displayMessage();

    }
}