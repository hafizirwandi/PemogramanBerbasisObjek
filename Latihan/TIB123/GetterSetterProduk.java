class Produk {
    private String merek;
    private double harga;
    private int stok;

    /*
     * 
     * Construct
     * adalah sebuat metdod tanpa tipe data yang dpanggil pertama kali saat objek
     * dibuat
     * nama construct harus sama dengan nama class
     * 
     */

    Produk(String a, double harga, int stok) {
        // merek = a;
        // this.harga = harga;
        // this.stok = stok;
        setMerek(a);
        setHarga(harga);
        setStok(stok);
    }

    // setter

    void setMerek(String merek) {
        this.merek = merek;
    }

    void setHarga(double harga) {
        if (harga < 3000) {
            System.out.println("Harga tidak boleh dibawah Rp.3000 . Harga yang anda masukkan " + harga);
            this.harga = 0;
        } else {
            this.harga = harga;
        }
    }

    void setStok(int stok) {
        if (stok < 0) {
            System.out.println("Stok tidak boleh minus. Stok yang anda inputkan " + stok);
            this.stok = 0;
        } else {
            this.stok = stok;
        }
    }

    void display() {
        System.out.println("Merek " + merek);
        System.out.println("Harga " + harga);
        System.out.println("Stok " + stok);
    }

}

public class GetterSetterProduk {
    public static void main(String[] args) {
        Produk obj = new Produk("Rinso", 2000, -1);
        obj.display();

        System.out.println("\n");
        System.out.println("\n");
        obj.setHarga(5000);
        obj.setStok(5);
        obj.display();

    }
}
