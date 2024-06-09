import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pink");
        list.add("Blue");
        list.add("Orange");
        list.add("Violet");
        System.out.println(list);
        String str1, str2;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                str1 = list.get(i);
                str2 = list.get(j);
                if ((str1.compareTo(str2)) > 0) {
                    list.set(i, str2);
                    list.set(j, str1);
                   
                }
            }
        }
        System.out.print("Sorted list :");
        System.out.println(list);
    }
}
