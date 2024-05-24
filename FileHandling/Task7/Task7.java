// 7. Problem statement: Write a Java program to parse a JSON file containing information about employees and display it in a structured format.

//    Test Case:
//    - Input: JSON file "employees.json" containing:
     
//      {
//        "employees": [
//          { "name": "John", "age": 30, "department": "IT" },
//          { "name": "Alice", "age": 25, "department": "HR" }
//        ]
//      }
     

//    - Output:
     
//      Employee Name: John
//      Age: 30
//      Department: IT

//      Employee Name: Alice
//      Age: 25
//      Department: HR
import java.io.BufferedReader;
import java.io.FileReader;
public class Task7 {
    public static void main(String[] args) {
        
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("Input7.json"))) {
            System.out.println("Output:");
            while ((line = br.readLine()) != null) {
                String arr[] = line.split(",");

                if (arr.length >= 3) {

                    String arr2[] = arr[0].split(":");
                    System.out.println("Employee Name:" + arr2[1].replaceAll("\"", "").trim());
                    String arr3[] = arr[1].split(":");
                    System.out.println("Age:" + arr3[1].trim());
                    String arr4[] = arr[2].split(":");
                    System.out.println("Department:" + arr4[1].replaceAll("\"", "").replaceAll("}", "").trim());

                }
                System.out.println("");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
