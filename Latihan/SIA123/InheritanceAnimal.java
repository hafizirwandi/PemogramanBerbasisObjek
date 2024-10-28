class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " make sound");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
        // Animal animal = new Animal(name);

    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(name + " Meoonngg!");
    }
}

public class InheritanceAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        animal.makeSound();
        System.out.println("\n");

        Cat cat = new Cat("Garfield");
        cat.makeSound();

    }
}
