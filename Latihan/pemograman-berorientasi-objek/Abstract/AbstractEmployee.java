abstract class Employee {
    String name;
}

class PermanentEmployee extends Employee {

}

public class AbstractEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(); // error
        employee.name = "Junaidi";

        PermanentEmployee emp1 = new PermanentEmployee();
        emp1.name = "Junaidi";

    }
}
