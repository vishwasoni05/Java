// 6. Problem statement: Develop a file encryption/decryption utility in Java that reads plaintext from a file, encrypts it, and saves the encrypted data to another file.

//    Test Case: (Encryption)
//    - Input: text file "input.txt" containing:
     
//      Hello, World!
     

//    - Output: Encrypted text file "encrypted.txt" containing encrypted data.

//    Test Case: (Decryption)
//    - Input: Encrypted text file "encrypted.txt"
//    - Output: Decrypted text file "decrypted.txt" containing:
     
//      Hello, World!
     

import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

class ReadWrite {
    FileWriter fout = null;
    FileReader fin = null;

    public void encrypt(String fPForReadingData, String fNForReadingData) {
        String str = "";
        if (fPForReadingData == null)
                fPForReadingData = "";
            
        try {
            fin = new FileReader(fPForReadingData + fNForReadingData + ".txt");
                int i = 0;
                while ((i = fin.read()) != -1) {
                    i += 2;
                    str = str + (char) i;
                }
            
            fin.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            fout = new FileWriter("Encrypted.txt");
            fout.write(str);
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReadWrite fh = new ReadWrite();
        String fPForReadingData = null, fNForReadingData = null;

        System.out.println("Enter the folderpath for reading data if any or leave empty for the current directory:");
        fPForReadingData = sc.nextLine();

        System.out.println("Enter the FileName for reading data from it:");
        fNForReadingData = sc.nextLine();

        

        fh.encrypt(fPForReadingData, fNForReadingData);

    }
}
