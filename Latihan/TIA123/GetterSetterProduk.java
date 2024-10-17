class Produk {
    // atribut
    private String merek;
    private double harga;
    private int stok;
    int jumlahBeli;

    /*
     * 
     * Construct
     * method yang pertama kali di akses ketika kita membuat sebuah objek
     * nama construct === nama class
     * biasanya digunakan untuk ngeset variable/atribut/program yang harus di
     * eksekusi pertama kali oleh si class
     * method ini tidak mempunyai tipe data
     */

    Produk(String a, double b, int stok) {
        merek = a;
        harga = b;
        // this.stok = stok;
        setStok(stok);
    }

    void displayInfo() {
        System.out.println("Merek " + merek);
        System.out.println("Harga " + harga);
        System.out.println("Stok " + stok);
    }

    // setter
    void setMerek(String merek) {
        this.merek = merek;
    }

    // setter
    void setHarga(double harga) {
        this.harga = harga;
    }

    void setStok(int stok) {
        if (stok < 0) {
            System.out.println("Stok anda tidak boleh negatif ,Stok yang anda inptkan " + stok);
            this.stok = 0;
        } else {
            this.stok = stok;
        }

    }
    // getter

    String getMerek() {
        return merek;
    }

    double getHarga() {
        return harga;
    }

    double getStok() {
        return stok;
    }

    private double jumlahBayar() {
        return jumlahBeli * harga;
    }

    private int hitungStok() {
        return stok - jumlahBeli;
    }

    void result() {

        if (hitungStok() < 0) {
            System.out.println("Tidak bisa dijual stok kurang");
        } else {

            System.out.println("Bnyk qty = " + jumlahBeli);
            System.out.println("Jumlah Bayar = " + jumlahBayar());
            System.out.println("Sisa Stok = " + hitungStok());
        }
    }

}

public class GetterSetterProduk {
    public static void main(String[] args) {
        // Produk obj = new Produk("Aqua", 3000, 5);

        // obj.displayInfo();
        // System.out.println("\n");

        // obj.setMerek("Amos");
        // obj.setHarga(5000);
        // obj.setStok(-1);
        // obj.merek = "Amos";
        // obj.harga = 3000;
        // obj.stok = 5;
        // obj.displayInfo();

        // System.out.println("Nama produk " + obj.getMerek() + " Stok " +
        // obj.getStok());

        Produk obj = new Produk("Aqua", 3000, 5);
        /*
         * 
         * objek mau beli 3 (int jumlahBeli)
         * jumlah harga yang harus dia bayar -> jumlahBeli * harga ( hitungJlhBayar())
         * Sisa stok method (sisa stok) -> stok - jumlahBeli
         * Retun sisa stok , return JumlahBayar
         * 
         */

        obj.jumlahBeli = 9;
        obj.result();

    }
}
