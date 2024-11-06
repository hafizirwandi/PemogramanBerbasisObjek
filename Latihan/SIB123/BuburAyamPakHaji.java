import java.util.Scanner;

class BuburAyam {
    String pembeli;
    double jlhBeli;
    double bayar;
    String penyajian;

    void display() {
        System.out.println("Nama pembeli " + pembeli);
        System.out.println("Jlh Beli " + jlhBeli);
        System.out.println("Bayar " + bayar);
        System.out.println("Penyajian " + penyajian);
    }

}

public class BuburAyamPakHaji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BuburAyam bubur = new BuburAyam();

        System.out.print("Nama pembeli : ");
        bubur.pembeli = scanner.nextLine();

        System.out.print("Jumlah beli : ");
        bubur.jlhBeli = scanner.nextDouble();

        System.out.print("Bayar : ");
        bubur.bayar = scanner.nextDouble();

        scanner.nextLine(); // Menangkap newline setelah nextInt
        System.out.print("Cara Penyajian : ");
        bubur.penyajian = scanner.nextLine();

        System.out.println("\n");
        bubur.display();

        // bubur.pembeli = "Alip";
        // bubur.jlhBeli = 2;
        // bubur.penyajian = "di aduk";
        scanner.close();
    }
}
