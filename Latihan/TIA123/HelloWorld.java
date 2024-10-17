class OnePiece {
    // atribut
    String nama;
    String jabatan;
    String keahlian;

    // method / fungtsi
    void displayInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Keahlian : " + keahlian);
    }
}

public class HelloWorld {
    public static void main(String[] arg) {
        // System.out.println("Hello Wold");

        OnePiece obj = new OnePiece();
        obj.nama = "Luffy";
        obj.jabatan = " Kapten";
        obj.keahlian = "Manusia Karet";

        obj.displayInfo();

    }
}
