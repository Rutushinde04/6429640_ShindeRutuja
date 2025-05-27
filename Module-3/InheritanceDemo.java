class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        a.makeSound();  // Outputs: Some generic animal sound
        d.makeSound();  // Outputs: Bark
    }
}

