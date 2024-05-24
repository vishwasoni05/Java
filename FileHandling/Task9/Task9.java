// 9. Problem statement: Implement a program to sort the contents of a text file alphabetically and save the sorted data to another file.

//    Test Case:
//    - Input: text file "input.txt" containing:

//  banana
//  apple
//  orange

//    - Output: text file "sorted_output.txt" containing:

//      apple
//      banana
//      orange

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Task9 {
    public static void bubbleSort(String[] arr) {
        int ans;
        String temp;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                ans = arr[i].compareTo(arr[j]);
                if (ans == 1) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        FileWriter fout = null;
        try {
            fout = new FileWriter("Sorted_output.txt");
            for (int i = 0; i < 3; i++) {
                fout.write(arr[i] + "\n");
            }
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("Sorted_output.txt"))) {
            System.out.println("Output:");
            while ((line = br.readLine()) != null) {
                System.out.println("\t"+line);

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        String File = "Input.txt";
        String line;
        String arr[] = new String[3];
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(File))) {
            while ((line = br.readLine()) != null) {
                // System.out.println(line);
                arr[count] = line;
                count++;
            }
            System.out.print("Input:\n");
            for (int i = 0; i < 3; i++) {
                System.out.print("\t" + arr[i] + "\n");
            }
            bubbleSort(arr);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}