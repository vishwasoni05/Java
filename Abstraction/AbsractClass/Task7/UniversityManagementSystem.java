// Scenario 7: University Management System
// Create an abstract class called "Person" with abstract methods like "registerCourse" and "submitAssignment." Implement derived classes like "Student" and "Professor" that provide specific implementations for these abstract methods.

abstract class Person {
    String position;
    String name;

    Person(String position, String name) {
        this.position = position;
        this.name = name;
    }

    void display() {
        System.out.println("\nPosition of Person:" + this.position);
        System.out.println(this.position + " name is:" + this.name);
    }

    abstract void registerCourse();

    abstract void submitAssignment();
}

class Student extends Person {
    int roll_no;
    String subject_name;
    String register_course_name;

    Student(String position, String name, int roll_no, String subject_name, String register_course_name) {
        super(position, name);
        this.roll_no = roll_no;
        this.subject_name = subject_name;
        this.register_course_name = register_course_name;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Roll no:" + roll_no);

    }

    @Override
    void registerCourse() {
        System.out.println("Student wants to register in " + this.register_course_name);
    }

    @Override
    void submitAssignment() {
        System.out.println("Assignment of " + subject_name + " submitted to proffesor.");
    }
}

class Proffesor extends Person {
    Proffesor(String position, String name) {
        super(position, name);
    }
    
    @Override
    void registerCourse() {
        System.out.println("Student Register course successfully!!");
    }

    @Override
    void submitAssignment(){
        System.out.println("Assignment is accepted.");
    }

}
public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student s = new Student("Student", "Vishwa", 444, "Java", "Python");
        s.display();
        s.registerCourse();
        s.submitAssignment();

        Proffesor p = new Proffesor("Proffesor", "Shrey Sir");
        p.display();
        p.registerCourse();
        p.submitAssignment();
    }
}
