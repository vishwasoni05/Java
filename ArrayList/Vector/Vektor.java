import java.util.Iterator;
import java.util.Vector;

public class Vektor {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();

        // for (int i = 0; i < 10; i++) {
        //     nums.add((int) (Math.random() * 100));
        // }
        nums.add(34);
        nums.add(56);
        nums.add(78);
        nums.add(45);
        nums.add(23);
        System.out.println(nums);

        // Iterator<Integer> i = nums.iterator();
        // while (i.hasNext()) {
        //     System.out.print(i.next()+", ");
        // }
        System.out.println("Remove element: " + nums.remove(3));
        System.out.println(nums);
        System.err.println("Size: " + nums.size());
        System.out.println("Last Index Of array: " + nums.lastIndexOf(nums));
        System.out.println("get value: " + nums.get(0));
        System.err.println("Set value: " + nums.set(2, 45));

    }
}
