package Modifier;
class Mahasiswa {
    private String nama;
    private int umur;

    // Constructor
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Method untuk mendapatkan nama (getter)
    public String getNama() {
        return nama;
    }

    // Method untuk mendapatkan umur (getter)
    public int getUmur() {
        return umur;
    }

    // Method untuk menampilkan info
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

public class PrivateModifier {
    public static void main(String[] arg) {
        Mahasiswa mhs1 = new Mahasiswa("Budi", 20);

        // Tidak bisa mengakses atribut nama dan umur secara langsung karena bersifat
        // private
        // System.out.println(mhs1.nama); // Error: nama memiliki akses private

        // Akses menggunakan metode publik (getter)
        System.out.println("Nama mahasiswa: " + mhs1.getNama());
        System.out.println("Umur mahasiswa: " + mhs1.getUmur());

        mhs1.tampilkanInfo();
    }
}