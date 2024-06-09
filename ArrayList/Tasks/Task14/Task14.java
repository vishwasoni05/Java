
import java.util.ArrayList;

public class Task14 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Pink");
        list.add("Blue");
        list.add("Orange");
        list.add("Violet");

        String temp;
        temp = list.get(0);
        list.set(0, list.get(1));
        list.set(1, temp);
        System.out.println("List after swaping two elemnets: "+list);
    }
}
