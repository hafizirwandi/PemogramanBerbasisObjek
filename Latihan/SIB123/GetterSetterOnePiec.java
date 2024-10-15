class BajakLaut {
    private String nama;
    String jabatan;
    String kemampuan;

    void display() {
        System.out.println("Nama : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Kemampuan : " + kemampuan);
    }

    // setter
    void setNama(String a) {
        nama = a;
    }

    // getter
    String getNama() {
        return nama;
    }

}

public class GetterSetterOnePiec {
    public static void main(String[] args) {
        // BajakLaut topiJerami = new BajakLaut();
        // topiJerami.setNama("Luffy");

        // System.out.println("Nama bajak laut adalah si " + topiJerami.getNama());
        // topiJerami.jabatan = "Kapten";
        // topiJerami.kemampuan = "Manusia Karet";

        // topiJerami.display();

        // BajakLaut topiJerami2 = new BajakLaut();
        // topiJerami2.setNama("Zorro");
        // topiJerami2.jabatan = "Wakil Kapten";
        // topiJerami2.kemampuan = "Pedang";

        // topiJerami2.display();

    }
}
