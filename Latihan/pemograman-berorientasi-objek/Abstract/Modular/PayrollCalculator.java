package Modular;

public class PayrollCalculator {
    public double calculateSalary(Employee employee) {
        // Menghitung gaji berdasarkan gaji dasar dan aturan tertentu
        return employee.getBaseSalary() * 1.2; // Contoh gaji dengan bonus 20%
    }
}
