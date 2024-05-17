// Scenario 1: Animal Sounds
// In an animal sounds application, create a base class called "Animal" with a method called "makeSound" that returns an instance of the "Sound" class. Implement derived classes like "Dog" and "Cat" that override the "makeSound" method and return their specific sound objects.

class Animal {
    String sound;

    Animal(String sound) {
        this.sound = sound;
    }

    Animal makeSound() {
        System.out.println("Animal class Method MakeSound");
        return this;
    }
}

class Dog extends Animal {
    Dog(String sound) {
        super(sound);
    }
    @Override
    Dog makeSound() {
        System.out.println("A " + super.sound + " is a sound most often produced by Dogs!!");
        return this;
    }
}

class Cat extends Animal {
    Cat(String sound) {
        super(sound);
    }

    @Override
    Cat makeSound() {
        System.out.println("A cat makes sound like "+super.sound);
        return this;
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        Animal a;
        a = new Animal("Null");
        a.makeSound();
        a = new Dog("Bark");
        a.makeSound();
        a = new Cat("Meow");
        a.makeSound();
    }
}
