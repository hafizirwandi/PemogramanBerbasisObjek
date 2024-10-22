class NasiGoreng {
    private String nama;
    private int jumlahCabai;
    private double harga;
    private boolean pedas;
    private int jumlahBeli;
    private double jumlahUang;

    void result() {
        jumlahCabai(pedas);
        System.out.println("Nama nasi goreng " + nama);
        System.out.println("Jumlah Cabai " + jumlahCabai);
        System.out.println("Total Bayar " + totalBayar());
        System.out.println("Kembalian " + kembalian());

    }

    NasiGoreng(String nama, boolean pedas, double harga, int jumlahBeli, double jumlahUang) {
        this.nama = nama;
        this.pedas = pedas;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
        this.jumlahUang = jumlahUang;

    }

    void jumlahCabai(boolean pedas) {
        this.pedas = pedas;
        if (this.pedas) {
            this.jumlahCabai = 8;
        } else {
            this.jumlahCabai = 2;
        }
    }

    double totalBayar() {
        double totalBayar = jumlahBeli * harga;
        return totalBayar;
    }

    double kembalian() {
        return jumlahUang - totalBayar();
    }

}

public class GetteSetterNasiGoreng {
    public static void main(String[] args) {

        NasiGoreng nasiGoreng = new NasiGoreng("Nasi Goreng Pataya", true, 10000, 5, 100000);

        nasiGoreng.result();
    }
}
