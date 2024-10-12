class Mobilx {
    String merek, nama, tahun;

    // construct
    public Mobilx(String merek2, String nama2, String tahun2) {
        nama = nama2;
        merek = merek2;
        tahun = tahun2;
    }

    void display() {
        System.out.println("Merek :" + merek);
        System.out.println("Nama :" + nama);
        System.out.println("Tahun :" + tahun);
    }
}

public class Construct {
    public static void main(String[] arg) {
        Mobilx obj = new Mobilx("Toyota", "Rush", "2023");
        obj.display();

        obj.nama = "Avanza";
        obj.display();
    }
}
