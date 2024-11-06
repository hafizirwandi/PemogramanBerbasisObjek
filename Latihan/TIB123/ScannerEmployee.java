import java.util.Scanner;

class Employee {
    String name;
    int usia;
    String jenisKelamin;

    void display() {
        System.out.println("Nama " + name);
        System.out.println("Usia " + usia);
        System.out.println("Jenis Kelamin " + jenisKelamin);
    }

    void penggajian() {
        System.out.println("Penggajian Employee");
    }
}

class PermanentEmployee extends Employee {

    @Override
    void display() {
        super.display();
        System.out.println("Tipe Employee : Permanent");
    }

    @Override
    void penggajian() {
        System.out.println("Penggajian Permanent Employee Berdasarkan Gaji bulanan");
    }
}

class ContractEmployee extends Employee {

    @Override
    void penggajian() {
        System.out.println("Penggajian Permanent Employee Berdasarkan sesuai kontrak");
    }

    @Override
    void display() {
        super.display();
        System.out.println("Tipe Employee : Contract");
    }
}

public class ScannerEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee bio = new PermanentEmployee();

        System.out.print("Masukkan nama : ");
        String name = scanner.nextLine();
        bio.name = name;

        System.out.print("Masukkan Usia : ");
        int usia = scanner.nextInt();
        bio.usia = usia;

        scanner.nextLine();
        System.out.print("Masukkan Jenis Kelamin : ");
        String jenisKelamin = scanner.nextLine();
        bio.jenisKelamin = jenisKelamin;

        bio.display();
        bio.penggajian();

        System.out.println("\n");
        /// contract Employee
        ///
        Employee bio2 = new ContractEmployee();

        System.out.print("Masukkan nama  : ");
        String name2 = scanner.nextLine();
        bio2.name = name2;

        System.out.print("Masukkan Usia : ");
        int usia2 = scanner.nextInt();
        bio2.usia = usia2;

        scanner.nextLine();
        System.out.print("Masukkan Jenis Kelamin : ");
        String jenisKelamin2 = scanner.nextLine();
        bio2.jenisKelamin = jenisKelamin2;

        bio2.display();
        bio2.penggajian();

        scanner.close();
    }

}