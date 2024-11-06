import java.util.Scanner;

class Mahasiswa {
    private String name;
    private String npm;

    // setter name
    void setName(String name) {
        this.name = name;
    }

    void setNpm(String npm) {
        this.npm = npm;
    }

    void storeAttribut(String name, String npm) {
        this.name = name;
        this.npm = npm;
    }

    void display() {
        System.out.println("\n");
        System.out.println("Name : " + name);
        System.out.println("NPM : " + npm);
    }

}

public class ScannerMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mahasiswa mhs = new Mahasiswa();
        System.out.print("Masukkan nama Mahasiswa : ");
        String name = scanner.nextLine();
        System.out.print("Masukkan nama NPM : ");
        String npm = scanner.nextLine();

        // mhs.setName(name);
        // mhs.setNpm(npm);
        mhs.storeAttribut(name, npm);
        mhs.display();

    }
}
