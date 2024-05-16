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
        System.out.println("\n"+shape_name + " Class");
    }
}

class Circle extends Shape {
    double radius;
    String shape_name;

    Circle(String shape_name, double radius) {
        super(shape_name);
        this.radius = radius;
        this.shape_name = shape_name;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of " + this.shape_name + ":" + (3.14 * this.radius * this.radius));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter of " + this.shape_name + ":" + (2 * 3.14 * this.radius));
    }
}

class Rectangle extends Shape {
    double length,width;
    String shape_name;
    Rectangle(String shape_name, double length,double width) {
        super(shape_name);
        this.length =length;
        this.shape_name = shape_name;
        this.width = width;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of " + this.shape_name + ":" + (this.length*this.width));
    }
    
    
    @Override
    void calculatePerimeter(){
        System.out.println("Perimeter of "+this.shape_name+":"+(2*(this.length+this.width)));
    }
}

public class ShapeCalculation {
    public static void main(String[] args) {
        Circle c = new Circle("Circle", 4.5);
        c.display();
        c.calculateArea();
        c.calculatePerimeter();

        Rectangle r = new Rectangle("Rectangle", 4.6, 6.7);
        r.display();
        r.calculateArea();
        r.calculatePerimeter();
    }    
}
