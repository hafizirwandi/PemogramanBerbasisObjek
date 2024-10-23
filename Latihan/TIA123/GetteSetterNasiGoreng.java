class NasiGoreng {
    // atribut /variable global
    private String nama;
    private int jumlahCabai;
    private double harga;
    private boolean pedas;
    private int jumlahBeli;
    private double jumlahUang;

    /*
     *
     * method => fungsi => program kecil yang digunakan untuk mengeksekusi perintah
     * sederhana
     * biasa nya method mempunyai paramater maka dari dikuti oleh () setelah nya
     * untuk mengirim parameter
     * method itu harus diikuti oleh pendamping seperti void / tipe data
     * ketika sebuat mthod tdk mempunyai return maka pendampingnya void
     * namun ketika mempunyai return pendampingnya adalah sesuai dgn si tipe return
     * 
     */
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

        if (pedas) {
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
