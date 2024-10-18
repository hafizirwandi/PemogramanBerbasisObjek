class Produk {
    private String merek;
    private double harga;
    private int stok;

    // Constructor
    Produk(String a, double b, int c) {
        merek = a;
        harga = b;
        stok = c;
    }

    // Method untuk menampilkan detail produk
    void display() {
        System.out.println("Merek: " + merek);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }

    // Setter dan Getter untuk atribut
    void setMerek(String a) {
        merek = a;
    }

    void setHarga(double b) {
        harga = b;
    }

    void setStok(int c) {
        stok = c;
    }

    String getMerek() {
        return merek;
    }

    double getHarga() {
        return harga;
    }

    int getStok() {
        return stok;
    }

    // Method untuk melakukan transaksi pembelian
    void beliProduk(int jumlahBeli) {
        if (hitungStok(jumlahBeli)) {
            double total = totalBayar(jumlahBeli);
            System.out.println("Item: " + merek);
            System.out.println("Jumlah: " + jumlahBeli);
            System.out.println("Harga: " + harga);
            System.out.println("Total Bayar: " + total);
            stok -= jumlahBeli; // Mengurangi stok
        } else {
            System.out.println("Barang melebihi stok");
        }
    }

    // Method private untuk menghitung apakah stok mencukupi
    private boolean hitungStok(int jumlahBeli) {
        return jumlahBeli <= stok;
    }

    // Method private untuk menghitung total bayar
    private double totalBayar(int jumlahBeli) {
        return jumlahBeli * harga;
    }
}

public class MainProduk {
    public static void main(String[] args) {
        // Membuat objek produk dengan merek Rinso, harga 5000, dan stok 5
        Produk produk = new Produk("Rinso", 5000, 5);

        // Menampilkan detail produk sebelum pembelian
        produk.display();
        System.out.println();

        // Simulasi pembelian produk sebanyak 2
        int jumlahBeli = 2;
        produk.beliProduk(jumlahBeli);

        // Menampilkan stok yang tersisa setelah pembelian
        System.out.println("\nSisa stok setelah pembelian: " + produk.getStok());
    }
}
