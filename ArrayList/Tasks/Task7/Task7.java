import java.util.ArrayList;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        list.add("Pink");
        list.add("Blue");
        list.add("Orange");
        list.add("Violet");
        // System.out.println(list);
        System.out.println("Enter the element you want to search:");
        String element = sc.nextLine();
        if (list.contains(element)) {
            System.out.println(element+" found in the list.");
        } else {
            System.out.println(element+" not found in the list.");
        
        }

    }
}
