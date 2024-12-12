import java.util.Scanner;

class Biodata {
    String nama;
    String jenisKelamin;
    int umur;

    void display() {
        System.out.println("Nama : " + nama);
        System.out.println("Jns Kelamin : " + jenisKelamin);
        System.out.println("Umur : " + umur);
    }
}

public class ScannerBiodata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Biodata bio = new Biodata();

        System.out.print("Masukkan Nama : ");
        bio.nama = scanner.nextLine();

        System.out.print("Masukkan Jns Kelamin : ");
        bio.jenisKelamin = scanner.nextLine();

        System.out.print("Masukkan Usia : ");
        bio.umur = scanner.nextInt();

        // bio.nama = "Taufik";
        // bio.jenisKelamin = "Laki-laki";
        // bio.umur = 20;

        bio.display();

        scanner.close();
    }
}
