import java.util.ArrayList;

public class Task9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list.add("Pink");
        list.add("Blue");
        list.add("Orange");
        list.add("Violet");
        System.out.print("List1 : "+list+"\n");

        list1.add("Banana");
        list1.add("Grapes");
        list1.add("Mango");
        list1.add("Chiku");
        System.out.print("List2 : " + list+"\n");
        list.addAll(list1);
        System.out.print("Adding list2 in list1 : "+list);
    }
}