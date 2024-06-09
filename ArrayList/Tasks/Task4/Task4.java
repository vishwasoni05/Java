import java.util.ArrayList;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        list.add("Pink");
        list.add("Blue");
        list.add("Orange");
        list.add("Violet");
        System.out.println(list);
        System.out.print("Enter the index of element you want to retrive:");
        int index = sc.nextInt();
        System.out.println(list.get(index));
    }
}