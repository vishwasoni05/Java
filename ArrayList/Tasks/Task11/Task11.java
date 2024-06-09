import java.util.ArrayList;

public class Task11 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list.add("Pink");
        list.add("Blue");
        list.add("Orange");
        list.add("Violet");
        System.out.println(list);

        for (int i = (list.size() - 1); i >= 0; i--) {
            list1.add(list.get(i));
        }
        System.out.println("Reverse list : "+list1);
    }
}
