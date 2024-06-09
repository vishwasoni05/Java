import java.util.LinkedList;
import java.util.Collections;
import java.util.Random;
public class Task {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
    
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("Pink");
        list.add("Orange");

        System.out.println(list);

        // Collections.shuffle(list);
        // System.out.println("Shuffled List: "+list);

        shuffleList(list);
        System.out.println("Shuffled List: " + list);

    }
    public static void shuffleList(LinkedList<String> l) {
    
        for (int i = l.size() - 1; i > 0; i--) {
           

            String temp = l.get(i);
            l.set(i, l.get(i-1));
            l.set((i-1), temp);
        } 
    }
}
