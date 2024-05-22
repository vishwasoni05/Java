// 9. Problem statement: Implement a program to sort the contents of a text file alphabetically and save the sorted data to another file.

//    Test Case:
//    - Input: text file "input.txt" containing:
     
//      banana
//      apple
//      orange
     

//    - Output: text file "sorted_output.txt" containing:
     
//      apple
//      banana
//      orange


import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

class ReadWrite {
    FileWriter fout = null;
    FileReader fin = null;

    public void sortOnData(String fPForReadingData, String fNForReadingData) {
        String str = "";
        int count=1;
        if (fPForReadingData == null)
                fPForReadingData = "";
            
        try {
            fin = new FileReader(fPForReadingData + fNForReadingData + ".txt");
                int i = 0;
                while ((i = fin.read()) != -1) {
                    str = str + (char) i;
                    if (i == 10) {
                        
                        count++;
                   }
                }
            
            fin.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            fout = new FileWriter("SortedData.txt");
            fout.write(str);
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReadWrite fh = new ReadWrite();
        String fPForReadingData = null, fNForReadingData = null;

        System.out.println("Enter the folderpath for reading data if any or leave empty for the current directory:");
        fPForReadingData = sc.nextLine();

        System.out.println("Enter the FileName for reading data from it:");
        fNForReadingData = sc.nextLine();

        

        fh.sortOnData(fPForReadingData, fNForReadingData);

    }
}

