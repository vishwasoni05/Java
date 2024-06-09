import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pink");
        list.add("Blue");
        list.add("Orange");
        list.add("Violet");
        // System.out.println(list);

        System.out.println(list.set(2, "Black"));
        System.out.println(list);
    }
}
