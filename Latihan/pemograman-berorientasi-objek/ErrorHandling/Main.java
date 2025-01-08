import java.util.Scanner;

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Validasi nama
            System.out.print("Masukkan nama: ");
            String name = scanner.nextLine();
            if (name.trim().isEmpty()) {
                throw new InvalidNameException("Nama tidak boleh kosong.");
            }

            // Validasi usia
            System.out.print("Masukkan usia: ");
            String ageInput = scanner.nextLine();
            int age;
            try {
                age = Integer.parseInt(ageInput);
            } catch (NumberFormatException e) {
                throw new InvalidAgeException("Usia harus berupa angka.");
            }

            if (age < 18) {
                throw new InvalidAgeException("Usia harus minimal 18 tahun.");
            }

            System.out.println("Pendaftaran berhasil! Nama: " + name + ", Usia: " + age);

        } catch (InvalidNameException | InvalidAgeException e) {
            System.out.println("Kesalahan: " + e.getMessage());

        } finally {
            System.out.println("Terima kasih telah menggunakan aplikasi kami.");
            scanner.close();
        }
    }
}