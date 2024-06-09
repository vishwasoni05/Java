import java.util.ArrayList;

public class Task18 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pink");
        list.add("Blue");
        list.add("Orange");
        list.add("Violet");
        // System.out.println(list);
        list.clear();
        if (list.size()!=0) {
            System.out.println("The list contains elements in it.");
        } else {
            System.out.println("The list is empty.");
        }
    }
}
