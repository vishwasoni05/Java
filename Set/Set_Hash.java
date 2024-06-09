import java.util.HashSet;
import java.util.Spliterator;
public class Set_Hash {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(345);
        hs.add(45);
        hs.add(879);

        // System.out.println(hs);
        // System.out.println(hs.contains(45));
        // hs.clear();
        // System.out.println(hs);
        // System.out.println(hs.isEmpty());
        // System.out.println(hs.size());
        // hs.remove(12);
        // System.out.println(hs);

        // HashSet<Integer> hs1 = (HashSet<Integer>) hs.clone();
        
        // System.out.println(hs1);

        Spliterator<Integer> s = hs.spliterator();
        // s.forEachRemaining(n->System.out.println(n));

        // s.tryAdvance(System.out::println);
        // s.tryAdvance(System.out::println);
        // s.tryAdvance(System.out::println);
        // s.tryAdvance(System.out::println);
       
    }
}
