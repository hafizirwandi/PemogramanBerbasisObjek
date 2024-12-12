package Modular;

public class ReportGenerator {
    public void generateReport(Employee employee, double salary) {
        System.out.println("Employee Report:");
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Salary: " + salary);
    }
}
