// Scenario 2: Shape Factory
// In a shape factory application, define an abstract base class called "Shape" with a method called "createShape" that returns an instance of the "Shape" class. Implement derived classes like "Circle" and "Rectangle" that override the "createShape" method and return their specific shape objects.

abstract class Shape {
    abstract Shape createShape();
}

class Circle extends Shape {
    Circle() {
        System.out.println("\n"+this.getClass().getName() + " Class Called!!");
    }

    @Override
    Circle createShape() {
        System.out.println("Circle shape created.");
        return this;
    }
}
class Rectangle extends Shape {
    Rectangle() {
        System.out.println("\n"+this.getClass().getName() + " Class Called!!");
    }
    @Override
    Rectangle createShape() {
        System.out.println("Rectangle shape created.");
        return this;
    }
}
public class ShapeFactory {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.createShape();

        s = new Rectangle();
        s.createShape();
    }
}
