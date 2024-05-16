// Scenario 2: Vehicle Manufacturing
// Design an abstract class called "Vehicle" with abstract methods like "assemble" and "paint." Implement derived classes like "Car" and "Motorcycle" that provide specific implementations for these abstract methods.

abstract class Vehicle {
    String vehicle_name;

    abstract void assemble();

    abstract void paint();

    Vehicle(String vehicle_name) {
        this.vehicle_name = vehicle_name;
    }

    void display() {
        System.out.println("\n Vehicle name is " + vehicle_name);
    }

    Vehicle() {
    }
}

class Car extends Vehicle {
    Car(String vehicle_name) {
        super(vehicle_name);
    }

    @Override
    void assemble() {
        System.out.println("Four tyres are assemble to " + vehicle_name);
    }

    @Override
    void paint() {
        System.out.println(vehicle_name + " is painted by black color");
    }
}

class MotorCycle extends Vehicle {
    MotorCycle(String vehicle_name) {
        super(vehicle_name);
    }
    @Override
    void assemble() {
        System.out.println("Two tyres are assemble to " + vehicle_name);
    }
    
    @Override
    void paint() {
        System.out.println(vehicle_name+" is painted by blue color");
    }
}
public class VehicleManufacturing {
    public static void main(String[] args) {
        Car c = new Car("Car");
        c.display();
        c.assemble();
        c.paint();

        MotorCycle m = new MotorCycle("MotorCycle");
        m.display();
        m.assemble();
        m.paint();
    }
}
