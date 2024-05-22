// 4. Problem statement: Implement a Java program to search for a specific string in a text file and display all occurrences along with their line numbers.

//    Test Case:
//    - Input: text file "input.txt" containing:
     
//      This is a test file.
//      Hello, World!
//      This is another test file.
     

//    - String to search: "test"
//    - Output:
     
//      Line 1: This is a test file.
//      Line 3: This is another test file.

import java.io.FileReader;
import java.util.Scanner;

class ReadData{
    FileReader fin = null;
    int line = 1,l;
    String str = "";
    CharSequence s = "test";
    public void readFile(String folderPath, String fileName) {
        if (folderPath == null)
            folderPath = "";
        try{
            fin=new FileReader(folderPath+fileName+".txt");
            int i=0;
            while ((i = fin.read()) != -1) {
                str = str + (char) i;
                
                if (i == 10) {
                    if (str.contains(s)) {
                        System.out.println("Line " + line + ": " + str);
                    }
                    str = "";
                    line++;

                }
               
                
            }
            
            
            System.out.println("\n\nEnd of File.");
            System.out.println("Total lines in file:" + line);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class Task4 {
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
