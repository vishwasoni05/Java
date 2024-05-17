// Scenario 5: Employee Management
// Design an abstract class called "Employee" with abstract methods like "calculateSalary" and "displayDetails." Implement derived classes like "Manager" and "Engineer" that provide specific implementations for these abstract methods.

abstract class Employee {
    double Total_salary;
    abstract void calculateSalary();

    abstract void displayDetails();
}

class Manager extends Employee {
    String employee_position;
    String employee_name;
    int id;
    double salary;

    Manager(String employee_position, String employee_name, int id, double salary) {
        this.employee_position = employee_position;
        this.employee_name = employee_name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    void displayDetails() {
        System.out.println("\nEmployee's Position:" + this.employee_position);
        System.out.println("Employee's name is:" + this.employee_name);
        System.out.println("Employee's id:" + this.id);
    }

    @Override
    void calculateSalary() {
        Total_salary = (this.salary * 12);
        System.out.println("Salary per annum:" + Total_salary);
    }

}

class Engineer extends Employee {
    String employee_position;
    String employee_name;
    int id;
    double salary;

    Engineer(String employee_position, String employee_name, int id, double salary) {
        this.employee_position = employee_position;
        this.employee_name = employee_name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    void displayDetails() {
        System.out.println("\nEmployee's Position" + this.employee_position);
        System.out.println("Employee's name is:" + this.employee_name);
        System.out.println("Employee's id:" + this.id);
    }

    @Override
    void calculateSalary() {
        Total_salary = (this.salary * 12);
        System.out.println("Salary per annum:" + Total_salary);
    }

}

public class EmployeeManagement {
    public static void main(String[] args) {
        Manager m = new Manager("Manager", "Mohak", 446, 500000);

        m.displayDetails();
        m.calculateSalary();

        Engineer e = new Engineer("Engineer", "Vishwa", 444, 600000);

        e.displayDetails();
        e.calculateSalary();
    }
}
