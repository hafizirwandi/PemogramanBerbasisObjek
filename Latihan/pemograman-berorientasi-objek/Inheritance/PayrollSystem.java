// Superclass
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void calculateSalary() {
        System.out.println("Menghitung gaji karyawan secara umum.");
    }
}

// Subclass untuk karyawan tetap
class PermanentEmployee extends Employee {
    PermanentEmployee(String name) {
        super(name);
    }

    @Override
    void calculateSalary() {
        System.out.println("Gaji karyawan tetap dihitung berdasarkan gaji bulanan.");
    }
}

// Subclass untuk karyawan kontrak
class ContractEmployee extends Employee {
    ContractEmployee(String name) {
        super(name);
    }

    @Override
    void calculateSalary() {
        System.out.println("Gaji karyawan kontrak dihitung berdasarkan jumlah jam kerja.");
    }
}

// Subclass untuk karyawan paruh waktu
class PartTimeEmployee extends Employee {
    PartTimeEmployee(String name) {
        super(name);
    }

    @Override
    void calculateSalary() {
        System.out.println("Gaji karyawan paruh waktu dihitung berdasarkan jumlah shift.");
    }
}

// Main class
public class PayrollSystem {
    public static void main(String[] args) {
        Employee emp1 = new PermanentEmployee("Alice");
        Employee emp2 = new ContractEmployee("Bob");
        Employee emp3 = new PartTimeEmployee("Charlie");

        // Polymorphic behavior
        emp1.calculateSalary(); // Output: Gaji karyawan tetap dihitung berdasarkan gaji bulanan.
        emp2.calculateSalary(); // Output: Gaji karyawan kontrak dihitung berdasarkan jumlah jam kerja.
        emp3.calculateSalary(); // Output: Gaji karyawan paruh waktu dihitung berdasarkan jumlah shift.
    }
}
