package FinalKeyword;

final class FinalClass {
    private final String message; // Final variable: nilainya tetap setelah inisialisasi

    // Constructor untuk menginisialisasi final variable
    public FinalClass(String message) {
        this.message = message;
    }

    // Final method: Tidak bisa dioverride
    public final void displayMessage() {
        System.out.println("Message: " + message);
    }

    // Getter untuk mendapatkan nilai message
    public String getMessage() {
        return message;
    }
}

// Class biasa
class ParentClass {
    // Final variable
    public final int maxValue = 100;

    // Method final: Tidak bisa dioverride
    public final void showInfo() {
        System.out.println("This is a final method from ParentClass.");
    }
}

// Tidak bisa extends FinalClass karena bersifat final
// class SubClass extends FinalClass {}

// Class yang mencoba override final method akan error
class SubClass extends ParentClass {
    // Error jika mencoba override
    // public void showInfo() {
    // System.out.println("Trying to override a final method.");
    // }
}

public class Main {
    public static void main(String[] args) {
        // Menggunakan final class
        FinalClass finalClass = new FinalClass("Hello, Java with final!");
        finalClass.displayMessage();

        // Menggunakan final variable
        ParentClass parent = new ParentClass();
        System.out.println("Max Value: " + parent.maxValue);

        // Menggunakan final method
        parent.showInfo();
    }
}
