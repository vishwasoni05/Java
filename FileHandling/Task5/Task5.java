// 5. Problem statement: Design a Java application to copy the contents of one text file to another.

//    Test Case:
//    - Input: text file "input.txt" containing:

//      Hello, World!

//    - Output: text file "output.txt" containing:

//      Hello, World!

import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

class ReadWrite {
    FileWriter fout = null;
    FileReader fin = null;

    public void copy(String fPForReadingData, String fNForReadingData, String fPForWritingData,String fNForWritingData) {
        String str = "";
        if (fPForReadingData == null)
                fPForReadingData = "";
            
        try {
            fin = new FileReader(fPForReadingData + fNForReadingData + ".txt");
                int i = 0;
                while ((i=fin.read()) != -1) {
                    str = str + (char) i;
                }
            System.out.println(str);
            fin.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (fPForWritingData == null)
                fPForWritingData = "";
        try {
            fout = new FileWriter(fPForWritingData + fNForWritingData + ".txt");
            fout.write(str);
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReadWrite fh = new ReadWrite();
        String fPForReadingData = null, fNForReadingData = null, fPForWritingData = null, fNForWritingData = null;

        System.out.println("Enter the folderpath for reading data if any or leave empty for the current directory:");
        fPForReadingData = sc.nextLine();

        System.out.println("Enter the FileName for reading data from it:");
        fNForReadingData = sc.nextLine();

        System.out.println("Enter the folderpath for writing data if any or leave empty for the current directory:");
        fPForWritingData = sc.nextLine();

        System.out.println("Enter the FileName for reading data from it:");
        fNForWritingData = sc.next();

        fh.copy(fPForReadingData, fNForReadingData, fPForWritingData, fNForWritingData);

    }
}
