abstract class Employee {
    void displayInfo() {
        System.out.println("ini method display info");
    }

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    @Override
    double calculateSalary() {
        return 5000;
    }

}

public class AbstractEmployee {
    public static void main(String[] arg) {
        Employee emp = new FullTimeEmployee();
        emp.displayInfo();
        System.out.println("Salary Employee is " + emp.calculateSalary());

    }
}
