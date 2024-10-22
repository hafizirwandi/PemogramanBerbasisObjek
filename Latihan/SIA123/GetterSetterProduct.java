class Product {

    private String namaProduct;
    private double harga;
    private int stok;
    int jumlahBeli;

    /*
     * construct (method yg dipanggil pertama kali)
     * nama construct === nama class
     */

    Product(String a, double b, int c) {
        namaProduct = a;
        // harga = b;
        // stok = c;
        setHarga(b);
        setStok(c);
    }

    void display() {
        System.out.println("Nama produk : " + namaProduct);
        System.out.println("Harga : Rp. " + harga);
        System.out.println("Jlh stok : " + stok);
    }

    // setter namaProduk
    void setProduct(String a) {
        namaProduct = a;
    }

    // setter harga
    void setHarga(double b) {
        harga = b;
        // if (b < 20000) {
        // System.out.println("Harga tidak boleh dibawah 6000");
        // harga = 0;
        // } else {
        // harga = b;
        // }

    }

    // setter stok
    void setStok(int c) {
        if (stok < 0) {
            System.out.println("Stok tidak boleh dibawah 0");
            stok = 0;
        } else {
            stok = c;
        }

    }

    private double totalBayar() {
        double totalHarga = jumlahBeli * harga;
        return totalHarga;
    }

    private int sisaStok() {
        int sisaStok = stok - jumlahBeli;
        stok = sisaStok;
        return sisaStok;
    }

    void result() {
        if (sisaStok() < 0) {
            System.out.println("Stok habis");
        } else {
            System.out.println("Item : " + namaProduct);
            System.out.println("Jumlah : " + jumlahBeli);
            System.out.println("Harga : Rp. " + harga);
            System.out.println("Total Bayar : Rp. " + totalBayar());
            System.out.println("Sisa stok : " + sisaStok());
        }
    }
}

public class GetterSetterProduct {
    public static void main(String[] args) {
        Product produk = new Product("Rinso", 5000, 5);
        produk.jumlahBeli = 2;
        produk.result();
        System.err.println("\n");
        produk.jumlahBeli = 1;
        produk.result();
        System.err.println("\n");
        produk.jumlahBeli = 3;
        produk.result();

    }
}

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
 * Sisa Stok = 3
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