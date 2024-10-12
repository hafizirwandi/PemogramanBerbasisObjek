/*
 * 
 * Class Mahasiswa
 * String nama;
 * Method : displayNama()
 */


class Mahasiswa {
    String nama;

    void displayNama() {
        System.out.print("Nama saya  : " + nama);
    }
}

public class ClassObject {
    public static void main(String[] args) {
        /*
         * OBJ class Mahasiswa
         * Set Parameter n
         * 
         */
        Mahasiswa obj = new Mahasiswa();
        obj.nama = "Nama";
        obj.displayNama();

    }
}
