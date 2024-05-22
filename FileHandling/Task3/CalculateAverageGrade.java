// 3. Problem statement: Create a program that reads a CSV file containing student information (such as name, ID, and grade) and calculates the average grade.

//    Test Case:
//    - Input: CSV file "students.csv" containing:
     
//      Name,ID,Grade
//      John,1,85
//      Alice,2,92
//      Bob,3,78
//      Emma,4,95
//      Michael,5,88
//      Sophia,6,91
//    - Output: Average grade: 88.17

import java.io.FileReader;
import java.util.Scanner;

class ReadData {
    FileReader fin = null;
    String str = "";
    public void readFile(String folderPath, String fileName) {

        if(folderPath == null) folderPath = "";

        try{
            fin = new FileReader(folderPath + fileName + ".csv");
            int i = 0;
            while ((i = fin.read()) != -1) {
                //     if (i >= 49 && i <= 57) {
                //         System.out.println((char)i);
                //    }
                // str = str + (char) i;
                System.out.print((char)i);
            }
            // System.out.println("String:\n" + str);
            // System.out.println(str.length());
            
            fin.close();
            System.out.println("\n\nEnd of File.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
public class CalculateAverageGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReadData fh = new ReadData();
        String folderPath = null, fileName = null;

        System.out.println("Enter the folderPath if any or leave empty for current directory:");
        folderPath = sc.nextLine();

        System.out.println("Enter the name of File:");
        fileName = sc.next();

        fh.readFile(folderPath, fileName);
    }
    
}
