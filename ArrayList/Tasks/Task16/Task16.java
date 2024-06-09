import java.util.ArrayList;

public class Task16 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list.add("Pink");
        list.add("Blue");
        list.add("Orange");
        list.add("Violet");
        System.out.println("Original Array:" + list);
        list1.addAll(list);
        System.out.println("Clone Array:" + list1);
        list.add("Black");
        System.out.println("Original Array:" + list);
        System.out.println("Clone Array:" + list1);
    }
}