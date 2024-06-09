import java.util.ArrayList;

public class Task22 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pink");
        list.add("Blue");
        list.add("Orange");
        list.add("Violet");
       
       System.out.println("Accessing elements by using indices of element."); 
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
