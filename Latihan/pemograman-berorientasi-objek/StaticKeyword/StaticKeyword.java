package StaticKeyword;

class MyClass {
    // Variabel kelas (static field)
    public static int count = 0;

    // Konstruktor
    public MyClass() {
        count++;
    }

    // Metode kelas (static method)
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Static block
    static {
        System.out.println("Kelas MyClass telah dimuat.");
    }

    // Inner class statis
    public static class NestedClass {
        public void display() {
            System.out.println("Ini adalah inner class statis.");
        }
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        // Menggunakan variabel kelas
        System.out.println("Jumlah objek MyClass: " + MyClass.count);

        // Membuat objek MyClass
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        System.out.println("Jumlah objek MyClass sekarang: " + MyClass.count);

        // Menggunakan metode kelas
        int hasilFaktorial = MyClass.factorial(5);
        System.out.println("Faktorial 5: " + hasilFaktorial);

        // Menggunakan inner class statis
        MyClass.NestedClass nested = new MyClass.NestedClass();
        nested.display();
    }
}