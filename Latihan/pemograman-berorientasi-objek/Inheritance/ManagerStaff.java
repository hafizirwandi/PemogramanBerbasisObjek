package Inheritance;

class Manager {
    String name;

    // void sayHello(String name) {
    // System.out.println("Hai, " + name + " Nama saya " + this.name);
    // }
    void sayHello(String name) {
        System.out.println("Hai, " + name + "Saya Manager, Nama saya " + this.name);
    }
}

class Staff extends Manager {
    @Override
    void sayHello(String name) {
        System.out.println("Hai, " + name + "Saya Staff, Nama saya " + this.name);
    }
}

public class ManagerStaff {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Hafiz";
        manager.sayHello("Jhon");

        Staff staff = new Staff();
        staff.name = "Ridho";
        staff.sayHello("Asri");
    }

}
