class Animal {
    private String nama, jenisHewan;
    private int jlhkaki;

    Animal(String a, String b) {
        // nama = a;
        // jenisHewan = b;
        setNama(a);
    }

    void display() {
        System.out.println("Nama " + nama);
        System.out.println("Jenis Hewa " + jenisHewan);
    }

    // Setter
    void setNama(String a) {

        nama = a;
    }

    // getter
   String  getNama(){
        return nama
    }

    int getJlhkaki() {
        return jlhkaki;
    }
}

public class ConstructAnimal {

    public static void main(String[] args) {
        Animal obj = new Animal("Kucing", "Karnivora");
        obj.display();

        obj.setNama(null); = "Mononyet";
        System.out.println(obj.getNama());
        obj.display();
    }
}
