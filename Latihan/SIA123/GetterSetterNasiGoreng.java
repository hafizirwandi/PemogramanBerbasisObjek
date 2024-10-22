class NasiGoreng {
    private String nama;
    private int jumlahCabe;
    private int jumlahGaram;
    private int jumlahMecin;

    void setNama(String nama) {
        this.nama = nama;
    }

    void setJumlahCabe(int jumlahCabe) {
        this.jumlahCabe = jumlahCabe;
    }

    void setJumlahMecin(int jumlahMecin) {
        this.jumlahMecin = jumlahMecin;
    }

    void setJumlahGaram(int jumlahGaram) {
        this.jumlahGaram = jumlahGaram;
    }

    String getNama() {
        return nama;
    }

    int getJumlahCabe() {
        return jumlahCabe;
    }

    int getJumlahGaram() {
        return jumlahGaram;
    }

    int getJumlahMecin() {
        return jumlahMecin;
    }

    void result() {
        System.out.println("Nama nasigoreng " + nama);
        System.out.println("Jumlah Cabe " + jumlahCabe);
        System.out.println("Jumlah Garam " + jumlahGaram);
        System.out.println("Jumlah Mecin " + jumlahMecin);
    }

}

public class GetterSetterNasiGoreng {
    public static void main(String[] args) {
        System.out.println("Hellooow Word");

        NasiGoreng nasiGoreng = new NasiGoreng();

        nasiGoreng.setNama("nasi goreng pataya");
        nasiGoreng.setJumlahCabe(4);
        nasiGoreng.setJumlahGaram(5);
        nasiGoreng.setJumlahMecin(5);

        nasiGoreng.result();
    }
}
