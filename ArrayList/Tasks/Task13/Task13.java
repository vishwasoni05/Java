import java.util.ArrayList;

public class Task13 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        
        list.add("Pink");
        list.add("Blue");
        list.add("Orange");
        list.add("Violet");
        System.out.println("List 1: "+list);

        list1.add("Pink");
        list1.add("Blue");
        list1.add("Orange");
        list1.add("Violet");
        System.out.println("List 2: "+list1);
        if (list.containsAll(list1)) {
            System.out.println("List is same.");
        } else {
            System.out.println("List is different.");
        }

    }
}
