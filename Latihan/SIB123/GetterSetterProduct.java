class Product {
    // atribut
    private String merek;
    private double harga;
    private int stok;

    /*
     * Construct :
     * method yang dipanggil trlebih dahulu ketika obj di create
     * construct tdk memiliki tipe data
     * nama construct === dgn nama class
     * 
     */

    Product(String a, double b, int c) {
        merek = a;
        harga = b;
        stok = c;
    }

    void display() {
        System.out.println("Merek : " + merek);
        System.out.println("Harga : " + harga);
        System.out.println("Stok : " + stok);
    }

    // void setMerek(String a) {
    // merek = a;
    // }

    // void setHarga(double b) {

    // harga = b;
    // }

    // void setStok(int c) {
    // stok = c;
    // }

    // void setAtribut(String a, double b, int c) {
    // merek = a;
    // harga = b;
    // stok = c;

    // }

    String getMerek() {
        return merek;
    }
}

public class GetterSetterProduct {
    public static void main(String[] args) {
        Product obj1 = new Product("Rinso", 3000, 5);

        System.out.println("Nama merek : " + obj1.getMerek());
        // Product obj1 = new Product();

        // // obj1.merek = "Rinso";
        // obj1.setMerek("Rinso");
        // // obj1.harga = 3000;
        // obj1.setHarga(3000);
        // // obj1.stok = 5;
        // obj1.setStok(5);

        // obj1.setAtribut("Rinso", 3000, 5);
        obj1.display();

    }
}
