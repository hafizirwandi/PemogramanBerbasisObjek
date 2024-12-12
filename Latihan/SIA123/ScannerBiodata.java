import java.util.Scanner;

class Biodata {
    String name;
    int usia;
    String jenisKelamin;

    void tampilkanBio() {
        System.out.println("-- Biodata --");
        System.out.println("Nama : " + name);
        System.out.println("Usia : " + usia);
        System.out.println("Jenis Kelamin : " + jenisKelamin);

    }
}

public class ScannerBiodata {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Biodata bio = new Biodata();

        System.out.print("Masukkan nama anda : ");
        bio.name = scan.nextLine();

        System.out.print("Masukkan usia anda : ");
        bio.usia = scan.nextInt();

        bio.tampilkanBio();

        scan.close();
    };
}
