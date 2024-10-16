class Minuman{
    //atribut nama, harga, stok
    String nama;
    double harga;
    int stok;


    void display(){
        System.out.println("Nama "+ nama);
        System.out.println("Harga "+ harga);
        System.out.println("stok "+ stok);
    }
}

public class ClassObject {
    public static void main(String[] args){
        Minuman minuman = new Minuman();

        //
        minuman.nama = "Aqua";
        minuman.harga = 5000;
        minuman.stok = 5;

        minuman.display();
    }
}
