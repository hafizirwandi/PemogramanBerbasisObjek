package Inheritance;

class Animal {
    String name;

    // Constructor dari superclass
    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    // Constructor dari subclass memanggil constructor superclass
    public Dog(String name) {
        super(name); // Memanggil constructor dari superclass (Animal)
    }

    // Override method dari superclass
    @Override
    public void makeSound() {
        super.makeSound(); // Memanggil method superclass
        System.out.println(name + " barks.");
    }
}

public class AnimalDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.makeSound(); // Buddy makes a sound. Buddy barks.
    }
}
