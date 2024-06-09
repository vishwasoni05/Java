import java.util.ArrayList;
import java.util.Scanner;
public class Task21 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        list.add("Pink");
        list.add("Blue");
        list.add("Orange");
        list.add("Violet");
        System.out.println(list);
        System.out.print("Enter the color you want to replace at second element:");
        String str = sc.nextLine();

        list.set(1, str);
        System.out.println("List after replacing second element: "+list);
    }
}
