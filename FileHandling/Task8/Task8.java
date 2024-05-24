// 8. Problem statement: Create a Java application to serialize and deserialize objects to/from a file using ObjectInputStream and ObjectOutputStream.

//    Test Case:
//    - Input: Object to serialize: Employee{name="John", age=30, department="IT"}

//    - Output: Serialized object saved to file "employee.ser"

//    - Input: Serialized object file "employee.ser"

//    - Output: Deserialized object: Employee{name="John", age=30, department="IT"}

import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

class Employees {
    String name;
    int age;
    String department;

    public Employees(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

}

public class Task8 {
    public static void main(String[] args) {
        Employees e1 = new Employees("Jhon", 30, "IT");
        try(ObjectOutputStream out=new ObjectOutputStream(new ())){

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}