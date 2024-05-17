// class Vehicle {
//     Vehicle startEngine() {
//         System.out.println("Starting the engine of a genric vehicle.");
//         return this;
//     }

// }

// class Car extends Vehicle {
//     @Override
//     Car startEngine() {
//         System.out.println("Starting the engine of a Car.");
//         return this;
//     }
// }

// class Shape {
//     Shape createShape() {
//         System.out.println("Creating generic shape.");
//         return this;
//     }
// }

// class Circle extends Shape {
//     @Override
//     Circle createShape() {
//         System.out.println("Creating Circle Shape");
//         return this;
//     }

// }
// class Rectangle extends Shape {
//     @Override
//     Rectangle createShape() {
//         System.out.println("Creating Rectangle Shape");
//         return this;
//     }
    
// }

// public class CoVRT {
//     public static void main(String[] args) {
        // Vehicle v = new Vehicle();
        // v.startEngine();

        // Car c = new Car();
        // c.startEngine();

        // Vehicle v1 = new Car();
        // v1.startEngine();

        // Car c1 = new Vehicle();
        // c1.startEngine();

        //1st Method
        // Shape s = new Shape();
        // Circle c = new Circle();
        // Rectangle r = new Rectangle();
        // Shape s1;
        // s1 = s;
        // s1.createShape();
        // s1 = c;
        // s1.createShape();
        // s1 = r;
        // s1.createShape();

        //2nd Method
        // Shape s = new Circle();
        // s.createShape();
        // Shape s1 = new Rectangle();
        // s1.createShape();


//     }
// }


//we cannot make object of super class by giving reference of child class in covariant return type...

//But we can make object of sub class by giving the reference of super class...




class Shape {
    public static void createShape() {
        System.out.println("Creating generic shape.");
        
    }
}

class Circle extends Shape {
    public static void createShape() {
        System.out.println("Creating Circle Shape");
        
    }

}
class Rectangle extends Shape {
    public static void createShape() {
        System.out.println("Creating Rectangle Shape");
       
    }
    
}

public class CoVRT {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.createShape();

        Shape s1 = new Rectangle();
        s1.createShape();
    }
}

//When we create static method in super class and extend that method in subclass and we want to call the static method of subclass by using refernce of super class than it won't work.

//we want to call subclass method by giving refrence it is not possible when static method override from super class..

//the refrence class method only called when we use satic keyword.