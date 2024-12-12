import java.util.Scanner;

class Biodata {
    String name;
    String usia;
    String jnsKelamin;

    void tampilkanBio() {
        System.out.println("-- Biodata --");
        System.out.println("Nama  " + name);
        System.out.println("Usia  " + usia);
        System.out.println("Jenis Kelamin  " + jnsKelamin);
    }
}

public class ScannerBiodata {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Biodata bio = new Biodata();
        // bio.name = "Garfield";
        // bio.tampilkanBio();

        System.out.print("Masukkan nama : ");
        bio.name = scan.nextLine();
        bio.tampilkanBio();

        scan.close();

    }

}
