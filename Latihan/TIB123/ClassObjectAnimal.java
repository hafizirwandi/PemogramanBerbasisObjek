class Animal {
    // atribut
    private String nama;
    private String jenis;
    String suara;

    // method
    void display() {
        System.out.println("Nama " + nama);
        System.out.println("Jenis " + jenis);
        System.out.println("Suara " + suara);
    }

    // setter
    void setNama(String a) {
        nama = a;
    }

    void setJenis(String b) {
        jenis = b;
    }

    // getter
    String getNama() {
        return nama;
    }

    String getJenis() {
        return jenis;
    }
}

public class ClassObjectAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();

        // set variable
        // animal.nama = "Kucing";
        animal.setNama("Kucing");
        // animal.jenis = "Persia";
        animal.setJenis("Persia");

        animal.suara = "Meong";

        System.out.println("Nama Hewan  " + animal.getNama());
        System.out.println("Jenis   " + animal.getJenis());
        System.out.println("Suara " + animal.suara);
        // animal.display();

        // obj baru

        // Animal animal2 = new Animal();
        // animal2.nama = "Anjing";
        // animal2.jenis = "Buldog";

        // animal2.display();

    }
}
