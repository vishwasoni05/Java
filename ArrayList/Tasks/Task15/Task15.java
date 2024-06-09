import java.util.ArrayList;

public class Task15 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pink");
        list.add("Blue");
        list.add("Orange");
        list.add("Violet");
        System.out.println("List1: "+list);
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Brown");
        list1.add("Yellow");
        list1.add("Purple");
        System.out.println("List2: "+list1);
        list.addAll(list1);
        System.out.println("List after joining two ArrayList: \n"+list);

    }
}

