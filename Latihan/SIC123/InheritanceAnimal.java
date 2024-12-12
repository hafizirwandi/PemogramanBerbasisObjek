class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(name + " Make Sound!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println(name + " meowss meowss arrrr");
    }
}

public class InheritanceAnimal {
    public static void main(String[] args) {
        // Animal animal = new Animal("hewan");

        // animal.makeSound();
        System.out.println("\n");

        Cat cat = new Cat("Garfield");
        cat.makeSound();
    }
}
