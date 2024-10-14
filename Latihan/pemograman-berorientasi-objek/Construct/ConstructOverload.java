package Construct;
// class User {
//     private String name;
//     private String email;
//     private int age;

//     // Constructor 1: Overloading dengan semua parameter
//     public User(String name, String email, int age) {
//         this.name = name;
//         this.email = email;
//         this.age = age;
//     }

//     // Constructor 2: Overloading dengan 2 parameter (tanpa umur, umur default 0)
//     public User(String name, String email) {
//         this.name = name;
//         this.email = email;
//         this.age = 0; // Umur default 0 jika tidak disediakan
//     }

//     // Constructor 3: Overloading dengan 1 parameter (tanpa email dan umur, umur
//     // default 0)
//     public User(String name) {
//         this.name = name;
//         this.email = "unknown"; // Email default
//         this.age = 0; // Umur default
//     }

//     // Method untuk menampilkan informasi user
//     public void tampilkanUser() {
//         System.out.println("Nama: " + name);
//         System.out.println("Email: " + email);
//         System.out.println("Umur: " + age);
//     }
// }

class User {
    private String name;
    private String email;
    private int age;

    // Constructor 1: Overloading dengan semua parameter
    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    // Constructor 2: Memanggil Constructor 1, dengan default age = 0
    public User(String name, String email) {
        this(name, email, 0); // Memanggil constructor dengan 3 parameter (name, email, default age)
    }

    // Constructor 3: Memanggil Constructor 2, dengan default email = "unknown"
    public User(String name) {
        this(name, "unknown"); // Memanggil constructor dengan 2 parameter (name, default email)
    }

    // Method untuk menampilkan informasi user
    public void tampilkanUser() {
        System.out.println("Nama: " + name);
        System.out.println("Email: " + email);
        System.out.println("Umur: " + age);
    }
}

public class ConstructOverload {
    public static void main(String[] args) {
        // Membuat objek user dengan semua informasi
        User user1 = new User("John Doe", "john@example.com", 25);
        user1.tampilkanUser();

        System.out.println();

        // Membuat objek user tanpa umur (umur default 0)
        User user2 = new User("Jane Doe", "jane@example.com");
        user2.tampilkanUser();

        System.out.println();

        // Membuat objek user hanya dengan nama (email default, umur default)
        User user3 = new User("Alex");
        user3.tampilkanUser();
    }
}
