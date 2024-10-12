/*
 * Class Mahasiswa
 * Attribut : nama, nim
 * Method : display() =>  Nama , dan NIM
 */

class Mahasiswa {
    // atribut
    String nama;
    String nim;

    void display() {
        System.out.println("Nama saya  adalah " + nama);
        System.out.println("NIM saya adalah " + nim);
    }
}

public class ClassObject {
    public static void main(String[] args) {
        /*
         * Obj dari class Mahasiswa
         * set Attribut
         * display()
         */
        Mahasiswa obj = new Mahasiswa();
        obj.nama = "Andi";
        obj.nim = "1314903042";
        obj.display();
    }
}
