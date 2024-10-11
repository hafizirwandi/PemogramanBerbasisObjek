class Mobil {
    String nama;
    String merek;
    String tahun;
    String nomorPlat;

    void displayInfo() {
        System.out.println(
                "Nama Merek : " + merek + "Nama mobil : " + nama + " Tahun : " + tahun + " Nomor Plat : " + nomorPlat);
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();

        mobil.merek = "Toyota";
        mobil.nama = "Pajero";
        mobil.tahun = "2012";
        mobil.nomorPlat = "BK 20202 K";

        mobil.displayInfo();

        Mobil mobil2 = new Mobil();
        mobil2.merek = "Toyota";
        mobil2.nama = "Rush";
        mobil2.tahun = "2021";
        mobil2.displayInfo();

    }

}