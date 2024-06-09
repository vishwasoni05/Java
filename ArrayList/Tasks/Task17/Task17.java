import java.util.ArrayList;

public class Task17 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pink");
        list.add("Blue");
        list.add("Orange");
        list.add("Violet");
        System.out.println(list);
        list.clear();
        System.out.println("List after removing all elements from List: "+list);
    }
}
