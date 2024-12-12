abstract class Hewan {
    protected String nama;
    protected int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public abstract void bersuara();

    public abstract void bergerak();

    public void informasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

class Kucing extends Hewan {
    public Kucing(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void bersuara() {
        System.out.println("Meong");
    }

    @Override
    public void bergerak() {
        System.out.println("Berlari");
    }

}

class Burung extends Hewan {
    public Burung(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void bersuara() {
        System.out.println("Kicau");
    }

    @Override
    public void bergerak() {
        System.out.println("Terbang");
    }
}

public class AbstractHewan {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Mimi", 2);
        // Burung burung = new Burung("Cici", 1);

       
        // kucing.bersuara();
        // kucing.bergerak();

        // System.out.println();

        // burung.informasi();
        // burung.bersuara();
        // burung.bergerak();
    }
}