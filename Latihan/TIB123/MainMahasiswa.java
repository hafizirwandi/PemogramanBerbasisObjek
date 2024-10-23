class Mahasiswa {
    // Atribut private (tidak bisa diakses langsung dari luar kelas)
    private String nama;
    private String NIM;
    private int nilai;

    // Constructor
    public Mahasiswa(String nama, String NIM, int nilai) {
        this.nama = nama;
        this.NIM = NIM;
        this.nilai = nilai;
    }

    // Getter untuk mendapatkan nama mahasiswa
    public String getNama() {
        return nama;
    }

    // Setter untuk mengubah nama mahasiswa
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk mendapatkan NIM mahasiswa
    public String getNIM() {
        return NIM;
    }

    // Setter untuk mengubah NIM mahasiswa
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    // Getter untuk mendapatkan nilai mahasiswa
    public int getNilai() {
        return nilai;
    }

    // Setter untuk mengubah nilai mahasiswa
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    // Method untuk menampilkan data mahasiswa
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Nilai: " + nilai);
    }
}

public class MainMahasiswa {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Ali", "12345", 85);

        // Menampilkan data mahasiswa
        System.out.println("Data Mahasiswa:");
        mahasiswa1.tampilkanData();

        // Mengubah nilai mahasiswa
        System.out.println("\nMemperbarui nilai mahasiswa...");
        mahasiswa1.setNilai(90);

        // Menampilkan data mahasiswa setelah diperbarui
        System.out.println("Data Mahasiswa setelah diperbarui:");
        mahasiswa1.tampilkanData();
    }
}
