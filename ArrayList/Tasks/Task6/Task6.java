import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pink");
        list.add("Blue");
        list.add("Orange");
        list.add("Violet");
        // System.out.println(list);

        System.out.println(list.remove(2));
        System.out.println(list);
    }
}
