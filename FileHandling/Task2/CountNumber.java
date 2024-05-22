// 2. Problem statement: Develop a Java application to count the number of words in a text file.

//    Test Case:
//    - Input: text file "input.txt" containing:
     
//      This is a test sentence.
     

//    - Output: 5

import java.io.FileReader;
import java.util.Scanner;

class Read{
    FileReader fin = null;
    int count = 0,flag=0;
    public void readFile(String folderPath, String fileName) {
        if (folderPath == null)
            folderPath = "";
        try{
            fin=new FileReader(folderPath+fileName+".txt");
            int i=0;
            while ((i = fin.read()) != -1) {
                if (i == 32 || i == 46) {
                    count++;
                }
            }
            
            System.out.println("Number of words in file:"+count);
            fin.close();
            System.out.println("End of file");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Read fh = new Read();
        String folderPath = null, fileName = null;
        
        System.out.println("Enter the folderPath if any or leave empty for the current Directory:");
        folderPath = sc.nextLine();

        System.out.println("Enter the name of File:");
        fileName = sc.next();

        fh.readFile(folderPath, fileName);
    }
}
