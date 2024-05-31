// 8. Problem statement: Create a Java application to serialize and deserialize objects to/from a file using ObjectInputStream and ObjectOutputStream.

//    Test Case:
//    - Input: Object to serialize: Employee{name="John", age=30, department="IT"}

//    - Output: Serialized object saved to file "employee.ser"

//    - Input: Serialized object file "employee.ser"

//    - Output: Deserialized object: Employee{name="John", age=30, department="IT"}

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee {
    String name;
    int age;
    String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

}

public class Task8 {
    public static void main(String[] args) {
        Employee emp = new Employee("Jhon", 30, "IT");

        serializeObject(emp, "employee.ser");

        System.out.println(deserializeObject("employee.ser"));

    }
    
    public static void serializeObject(Employee emp, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(emp);
            System.out.println("Object serialized successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Employee deserializeObject(String fileName) {
        Employee emp = null;
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fileName))){
            emp = (Employee) ois.readObject();
            System.out.println("Object deserialized successfully!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return emp;
    }
}