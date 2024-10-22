import java.util.Scanner;

public class KalkulatorSederhana {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Menampilkan menu operasi
        System.out.println("Selamat datang di Kalkulator Sederhana!");
        System.out.println("Pilih operasi yang ingin Anda lakukan:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        // Meminta pengguna untuk memilih operasi
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = scanner.nextInt();

        // Meminta input dua angka dari pengguna
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        // Variabel untuk menyimpan hasil perhitungan
        double hasil = 0;

        // Melakukan operasi sesuai pilihan pengguna
        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil penjumlahan: " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil pengurangan: " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil perkalian: " + hasil);
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil pembagian: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak valid.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid. Harap pilih antara 1-4.");
        }

        // Menutup Scanner
        scanner.close();
    }
}
