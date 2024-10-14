class Product {
    private String namaProduct;
    private double harga;
    private int stok;

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
        if (b < 60000) {
            System.out.println("Harga tidak boleh dibawah 6000");
            harga = 0;
        } else {
            harga = b;
        }

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
}

public class GetterSetterProduct {
    public static void main(String[] args) {
        Product produk = new Product("Rinso", 3000, -1);
        // produk.display();

        System.out.println("\n");

        // produk.namaProduct = "Soklin";
        produk.setProduct("Soklin");
        // produk.harga = 5000;
        produk.setHarga(5000);
        // produk.stok = 5;
        produk.setStok(5);
        // produk.display();
    }
}

/*
 * Nama produk rinso
 * Harga tidak boleh di bawah 6000
 * Stok tidak boleh dibawah 0
 * 
 * Nama Produk Soklin
 * harga tidak boleh dibawah 6000
 * Jlh Stok 5
 */