// Kelas abstrak Employee
abstract class Employee {
    protected String name;
    protected int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Metode abstrak - tidak memiliki implementasi
    public abstract double calculateSalary();

    // Metode non-abstrak - memiliki implementasi
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Subclass untuk pegawai penuh waktu (FullTimeEmployee)
class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(String name, int id, double salary) {
        super(name, id); // construct parent
        this.salary = salary;
    }

    // Implementasi metode calculateSalary untuk FullTimeEmployee
    @Override
    public double calculateSalary() {
        return salary; // Gaji tetap
    }
}

// Subclass untuk pegawai kontrak (Contractor)
class Contractor extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Contractor(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementasi metode calculateSalary untuk Contractor
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked; // Gaji berdasarkan jam kerja
    }
}

// Kelas utama untuk menjalankan program
public class MainEmployee {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee("Alice", 101, 5000);
        Contractor emp2 = new Contractor("Bob", 102, 20, 120);

        // Menampilkan detail dan gaji karyawan
        emp1.showDetails();
        System.out.println("Salary: " + emp1.calculateSalary());

        emp2.showDetails();
        System.out.println("Salary: " + emp2.calculateSalary());
    }
}
