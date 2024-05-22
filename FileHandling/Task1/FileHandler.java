// 1. Problem statement: Write a Java program to read data from a text file and display it on the console.

//    Test Case:
//    - Input: text file "input.txt" containing:
     
//      Hello, World!
//      This is a test file.
     

//    - Output:
     
//      Hello, World!
//      This is a test file.
     
import java.io.FileReader;
import java.util.Scanner;

class Read{
    
    FileReader fin = null;
    Scanner sc = new Scanner(System.in);

    public void readFile(String folderPath, String fileName) {
        if (folderPath == null)
            folderPath = "";
        try{
            fin=new FileReader(folderPath+fileName+".txt");
            int i=0;
            while((i=fin.read()) !=-1) System.out.print((char)i);

            fin.close();
            System.out.println("\n\nEnd of File...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class FileHandler {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Read fh = new Read();
        String folderPath = null, fileName = null;
        
        System.out.println("Enter the folderpath if any or leave empty for the current directory:");
        // sc.nextLine();
        folderPath = sc.nextLine();

        System.out.println("Enter the name of the file:");
        fileName = sc.next();

        fh.readFile(folderPath, fileName);
    }
}

