package Modifier;
class MediaSocial {
    protected String username;

    // Constructor
    public MediaSocial(String username) {
        this.username = username;
    }

    // Method protected dapat diakses di subclass
    protected void tampilkanUsername() {
        System.out.println("Username: " + username);
    }
}

class Facebook extends MediaSocial {
    private String status;

    // Constructor
    public Facebook(String username, String status) {
        super(username); // Mengakses atribut di superclass
        this.status = status;
    }

    // Method untuk menampilkan status dan username
    public void tampilkanProfil() {
        tampilkanUsername(); // Bisa mengakses method protected di superclass
        System.out.println("Status: " + status);
    }
}

public class ProtectedModifier {
    public static void main(String[] args) {
        Facebook userFb = new Facebook("john_doe", "Feeling happy!");

        // Tidak bisa mengakses username secara langsung dari luar kelas
        // System.out.println(userFb.username); // Error: username is protected

        // Memanggil method public untuk menampilkan profil
        userFb.tampilkanProfil();
    }
}
