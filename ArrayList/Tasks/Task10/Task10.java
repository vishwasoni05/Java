import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class Task10 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }

        System.out.println("Original List: " + list);

        // Collections.shuffle(list);
        // System.out.println("Shuffled List: "+list);

        // Random rand=new Random();
        // Collections.shuffle(list, rand);
        // System.out.println("Shuffled List: " + list);

    }
    
    public static void shuffleList(List<Integer> l) {
        Random r = new Random();
        for (int i = l.size() - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);

            int temp = l.get(i);
            l.set(i, l.get(j));
            l.set(j, temp);
        }
    }
}
