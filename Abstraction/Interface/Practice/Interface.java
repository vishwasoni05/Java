interface Person {
    //By defualt the methods and variables are public Static final
    //And we have to initialize the variables becuse it is constant

    //String name=null;
    //int age=0;

    //In interface we only declared abstract method  and we also make only static methods

    void display();

    static void sayMyName() {
        System.out.println("Vishwa");
    }
}

class Student implements Person {
    String name;
    int age;
    int roll_no;

    Student(String name, int age, int roll_no) {
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
    }
    @Override
    public void display() {
        System.out.println("Name:"+this.name+"\nAge:"+this.age+"\nRoll No:"+this.roll_no);
    }
}
public class Interface {
    public static void main(String[] args) {
        Student s = new Student("Vishwa", 19, 444);
        s.display();
        // Person.sayMyName();
    }
}