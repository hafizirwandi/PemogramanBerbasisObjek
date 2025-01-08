class Lingkaran {
    static final double phi = 3.14;

    double hitungLuas(final double phi, double r) {
        // phi = 4.14;
        return phi * r * r;
    }

}

class Persegi {
    final double sisi;

    Persegi(double sisi) {
        this.sisi = sisi + 1;
    }

    double hitungLuas() {
        return sisi * sisi;
    }
}

class Department {
    final void display() {
        System.out.println("ini display dari class Department");
    }
}

class Employee extends Department {
    // @Override
    // void display() {
    // System.out.println("ini display dari class Employee");
    // }
    // error ketika di ovveride
}

public class FinalKeyword {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        System.out.println("Phi saat ini : " + lingkaran.phi);

        System.out.println("Luas lingkaran saat ini : " + lingkaran.hitungLuas(3.14, 7));
        // lingkaran.phi = 4.14;
        // System.out.println("Phi saat ini : " + lingkaran.phi);

        Department employee = new Employee();
        employee.display();

        Persegi persegi = new Persegi(4);
        System.out.println("Luas persegi adalah  :" + persegi.hitungLuas());

    }
}
