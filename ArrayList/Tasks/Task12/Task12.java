import java.util.ArrayList;

public class Task12 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pink");
        list.add("Blue");
        list.add("Orange");
        list.add("Violet");
        list.add("Red");
        list.add("Black");
        list.add("Cyan");
        System.out.println(list);
        
        for (int i = 1; i <= 4; i++) {
           System.out.println( list.get(i));
        }
    }
}
