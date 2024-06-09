// 2. Write a Java program to iterate through all elements in an array list.
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pink");
        list.add("Blue");
        list.add("Orange");
        list.add("Violet");
        // System.out.println(list);

        for (String iterator : list) {
            System.out.println(iterator);
        }
    }
}
