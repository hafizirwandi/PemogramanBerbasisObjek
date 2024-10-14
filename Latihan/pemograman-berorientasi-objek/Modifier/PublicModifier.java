package Modifier;
class Twitter {
    public int jumlahTeman;
    public boolean onlineStatus;

    // Constructor
    public Twitter(int jumlahTeman, boolean onlineStatus) {
        this.jumlahTeman = jumlahTeman;
        this.onlineStatus = onlineStatus;
    }

    // Method public bisa diakses dari mana saja
    public void tampilkanStatus() {
        System.out.println("Jumlah Teman: " + jumlahTeman);
        System.out.println("Status Online: " + (onlineStatus ? "Online" : "Offline"));
    }
}

public class PublicModifier {
    public static void main(String[] args) {
        Twitter user1 = new Twitter(150, true);

        // Atribut public bisa diakses langsung dari luar kelas
        System.out.println("Teman: " + user1.jumlahTeman);
        System.out.println("Status Online: " + (user1.onlineStatus ? "Online" : "Offline"));

        // Memanggil method public
        user1.tampilkanStatus();
    }
}
