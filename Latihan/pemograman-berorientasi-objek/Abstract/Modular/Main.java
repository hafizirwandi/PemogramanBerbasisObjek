
package Modular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat modul EmployeeRepository untuk menyimpan dan mengambil data karyawan
        EmployeeRepository repository = new EmployeeRepository();

        // Menambahkan karyawan melalui input pengguna
        System.out.print("Berapa banyak karyawan yang ingin Anda tambahkan? ");
        int jumlahKaryawan = scanner.nextInt();
        scanner.nextLine(); // Konsumsi baris kosong setelah input jumlah

        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.print("Masukkan nama karyawan: ");
            String name = scanner.nextLine();
            System.out.print("Masukkan ID karyawan: ");
            int id = scanner.nextInt();
            System.out.print("Masukkan gaji dasar karyawan: ");
            double baseSalary = scanner.nextDouble();
            scanner.nextLine(); // Konsumsi baris kosong setelah input gaji

            Employee employee = new Employee(name, id, baseSalary);
            repository.addEmployee(employee);
        }

        // Modul PayrollCalculator untuk menghitung gaji karyawan
        PayrollCalculator calculator = new PayrollCalculator();

        // Modul ReportGenerator untuk menghasilkan laporan gaji
        ReportGenerator report = new ReportGenerator();

        // Menghasilkan laporan untuk setiap karyawan
        for (Employee employee : repository.getAllEmployees()) {
            double salary = calculator.calculateSalary(employee);
            report.generateReport(employee, salary);
        }

        scanner.close();
    }
}
