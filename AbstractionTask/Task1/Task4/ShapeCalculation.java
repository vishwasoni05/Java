// Scenario 4: Shape Calculation
// Create an abstract class called "Shape" with abstract methods like "calculateArea" and "calculatePerimeter." Implement derived classes like "Circle" and "Rectangle" that provide specific implementations for these abstract methods.

abstract class Shape {
    String shape_name;

    Shape(String shape_name) {
        this.shape_name = shape_name;
    }

    abstract void calculateArea();

    abstract void calculatePerimeter();

    void display() {
        System.out.println("\n ");
    }
}
public class ShapeCalculation {
    
}
