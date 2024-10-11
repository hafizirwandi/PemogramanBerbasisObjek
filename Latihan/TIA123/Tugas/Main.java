package Tugas;

import java.util.Scanner;

class Mahasiswa {
    // Atribut Mahasiswa
    private String nama;
    private int nim;
    private String jurusan;
    private double ipk;

    // Constructor untuk inisialisasi atribut
    public Mahasiswa(String nama, int nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        // this.ipk = ipk;
        setIpk(ipk); // Gunakan setter untuk validasi IPK
    }

    // Getter untuk IPK
    public double getIpk() {
        return ipk;
    }

    // Setter untuk IPK dengan validasi
    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    // Method untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
    }

    // Method untuk mengecek kelulusan
    public String cekKelulusan() {
        if (ipk >= 2.75) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIM mahasiswa: ");
        int nim = scanner.nextInt();

        System.out.print("Masukkan jurusan mahasiswa: ");
        scanner.nextLine(); // Mengambil input jurusan setelah input integer
        String jurusan = scanner.nextLine();

        System.out.print("Masukkan IPK mahasiswa: ");
        double ipk = scanner.nextDouble();

        // Membuat objek mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa(nama, nim, jurusan, ipk);

        // Menampilkan informasi mahasiswa
        System.out.println("\nInformasi Mahasiswa:");
        mahasiswa1.tampilkanInfo();

        // Menampilkan status kelulusan
        System.out.println("Status kelulusan: " + mahasiswa1.cekKelulusan());

        scanner.close();
    }
}
