abstract class Person {
    String name;
    int age;

    abstract void display();

    void fun() {
        System.out.println("Fun method from Person class");
    }
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Person() {} 
}

class Student extends Person {
    int roll_no;

    Student(String name, int age, int roll_no) {
        super(name, age);
        this.roll_no = roll_no;
    }

    void display() {
        System.out.println("Displaying Student Details:");
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Roll_no:"+roll_no);
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Student s = new Student("Vishwa", 19, 419);
        s.display();
        s.fun();
    }
}