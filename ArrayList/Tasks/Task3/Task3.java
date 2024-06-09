// 3. Write a Java program to insert an element into the array list at the first position

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pink");
        list.add("Blue");
        list.add("Orange");
        list.add("Violet");
        list.add(0, "Black");
        System.out.println(list);
        
    }
}
