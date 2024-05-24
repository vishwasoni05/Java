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
import java.io.BufferedReader;

public class CalculateAverageGrade {
    public static void main(String[] args) {
        String line, delim = ",";
        int totalGrades = 0, count = 0;

        try(BufferedReader br=new BufferedReader(new FileReader("Input3.csv"))){
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] student = line.split(delim);

                if (student.length == 3) {
                    int grade = Integer.parseInt(student[2].trim());
                    totalGrades += grade;
                    count++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (count > 0) {
            double averageGrade = (double) totalGrades / count;
            System.out.printf("\n Average Grade:%.2f",averageGrade);
        } else {
            System.out.println("No student data found");
        }
    }
}

