/*
 * Class Mobil
 * Atribut : Merek, Nama, Tahun
 * Method : display()=> tampilkan semua atribut
 */

public class ClassObject {
    public static void main(String[] arg) {
        /*
         * 
         * Buat Obj dari Class Mobil
         * set Atribut
         * call method display()
         */

        Mobil obj = new Mobil();
        obj.merek = "Toyota";
        obj.nama = "Rush";
        obj.tahun = "2022";
        obj.display();

         /*
         * 
         * Buat Obj baru dari Class Mobil
         * Dgn variabel yg lain 
         */
    }
}

class Mobil {
    String merek, nama, tahun;

    void display() {
        System.out.println("Merek : " + merek);
        System.out.println("Nama : " + nama);
        System.out.println("Tahun : " + tahun);
    }
}
