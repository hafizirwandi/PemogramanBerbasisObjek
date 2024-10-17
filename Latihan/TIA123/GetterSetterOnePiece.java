class OnePiece {
    // atribut
    private String nama;
    private String jabatan;
    private String keahlian;
    private String jurus;

    // method / fungtsi
    void displayInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Keahlian : " + keahlian);
    }

    // setter Nama
    void setNama(String a) {
        nama = a;
    }

    void setJabatan(String b) {
        jabatan = b;
    }

    void setKeahlian(String c) {
        keahlian = c;
    }

    void setJurus(String d) {
        jurus = d;
    }

    // getter
    String getJurus() {
        return jurus;
    }
}

public class GetterSetterOnePiece {
    public static void main(String[] arg) {
        // System.out.println("Hello Wold");

        OnePiece obj = new OnePiece();
        // obj.nama = "Luffy";
        obj.setNama("Luffy");
        // obj.jabatan = " Kapten";
        obj.setJabatan("Kapten");
        // obj.keahlian = "Manusia Karet";
        obj.setKeahlian("Manusia Karet");
        // obj.jurus = "Gatling Gun";

        obj.setJurus("Gatling Gun");
        System.out.println("Jurus " + obj.getJurus());

        // obj.displayInfo();

    }
}