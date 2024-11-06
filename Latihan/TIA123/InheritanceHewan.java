
import java.util.Scanner;

class Hewan {
    String name;

    Hewan(String name) {
        this.name = name;
    }

    void makan() {
        System.out.println(name + " sedang makan");
    }
}

class Kucing extends Hewan {

    Kucing(String nama) {
        super(nama); // memanggil construct dari parent
        // Hewan hewan = new Hewan(name);
    }

    @Override
    void makan() {
        super.makan();
        System.out.println(name + " makan ikan");
    }
}

public class InheritanceHewan {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Boby kartanegara");
        kucing.makan();

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan kata2 mutiara : ");
        String str = scanner.nextLine();
        System.out.println("anda mengetikkan str " + str);

        // Close the scanner
        scanner.close();
    }
}
