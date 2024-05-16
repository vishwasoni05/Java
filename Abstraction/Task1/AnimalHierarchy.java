// Scenario 1: Animal Hierarchy
// Create an abstract class called "Animal" with abstract methods like "eat" and "sound." Implement derived classes like "Cat" and "Dog" that provide specific implementations for these abstract methods.

abstract class Animal {
    String animal_name;

    abstract void eat();

    abstract void sound();

    Animal(String animal_name) {
        this.animal_name = animal_name;
    }

    void display() {
        System.out.println("Animal is "+animal_name);
    }
    Animal(){} 
}

class Cat extends Animal {
    Cat(String animal_name) {
        super(animal_name);
    }

    void eat() {
        System.out.println(animal_name + " eats birds.");
    }
    
    void sound() {
        System.out.println(animal_name + " sounds like meows.");
    }
}

class Dog extends Animal {
    Dog(String animal_name) {
        super(animal_name);
    }

    void eat() {
        System.out.println(animal_name + " eats Roti.");
    }

    void sound() {
        System.out.println(animal_name+" is barking.");
    }
}

public class AnimalHierarchy {
   public static void main(String[] args) {
       Cat c = new Cat("Cat");
       c.display();
       c.eat();
       c.sound();

       Dog d = new Dog("Dog");
       d.display();
       d.eat();
       d.sound();
   }
}
