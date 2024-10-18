
class Produk {
    // attribut (variable) => tempat menyimpan data
    private String merek;
    private double harga;
    private int stok;
    int jumlahBeli;

    /*
     * constructor
     * method yang deksekusi pertamakali saat obj dari class dibuat
     * nama construct === nama Class
     * construct tidak punya tipe data
     * biasanya construct ini digunakan untuk mengeset/menetapkan variabel/atribut
     */

    Produk(String a, double b, int c) {
        merek = a;
        harga = b;
        stok = c;
    }

    // method (fungsi) => program kecil yang bertujuan untuk mengeksekusi perintah
    // sederhana
    void display() {
        System.out.println("Merek " + merek);
        System.out.println("Harga " + harga);
        System.out.println("Stok " + stok);
    }

    // setter
    void setMerek(String a) {
        merek = a;
    }

    void setHarga(double b) {
        harga = b;
    }

    void setStok(int c) {
        stok = c;
    }

    // getter
    String getMerek() {
        return merek;
    }

    double getHarga() {
        return harga;
    }

    int getStok() {
        return stok;
    }

    void result() {

    }

}

public class GetterSetterProduk {

    public static void main(String[] args) {
        // System.out.println("Hello Word");

        // Produk obj = new Produk();
        // // set Atribut
        // obj.merek = "Aqua";
        // obj.harga = 5000;
        // obj.stok = 5;

        // obj.display();

        // Produk produk = new Produk("Soklin", 3000, 4);
        // produk.display();

        // System.out.println("\n");

        // produk.setMerek("Rinso");
        // produk.setHarga(5000);
        // produk.setStok(5);

        // produk.merek = "Rinso";
        // produk.harga = 5000;
        // produk.stok = 5;
        // System.out.println("Nama merek " + produk.getMerek());
        // System.out.println("Nama harga " + produk.getHarga());
        // System.out.println("Nama stok " + produk.getStok());
        // produk.display();

        /*
         * 
         * Studi kasus :
         * Punya sebuah object Produk ("Rinso",5000,5)
         * kita membeli produk -> masukkan nilai varible jumlahBeli
         * Input : jumlahBeli = 2
         * Output :
         * Item : Rinso
         * Jlh : 2
         * Harga : 5000
         * TotalBayar = 10000
         * 
         * Buat kondisi
         * jika jumlahBeli > stok
         * Output :
         * Barang melebihi stok
         * 
         * 
         * Syarat :
         * ada method private hitungStok()
         * ada method private totalBayar()
         * 
         */
        Produk produk = new Produk("Rinso", 5000, 4);
        produk.jumlahBeli = 2;
        produk.result();

    }
}
