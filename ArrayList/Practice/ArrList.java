import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrList {
    public static void main(String[] args) {
        // ArrayList list = new ArrayList();

        // list.add(444);
        // list.add(45.444f);
        // list.add(876.897);
        // list.add('s');
        // list.add("this is string");

        // System.out.println(list);

        // ArrayList<Integer> list = new ArrayList<>();//Type safe

        // list.add(435);
        // list.add(567);
        // list.add(89);

        // System.out.println(list);

        ArrayList<String> list = new ArrayList<String>();

        list.add("Ram");
        list.add("Shiv");
        list.add("Hanuman");
        list.add("Narayan");
        list.add("Krishna");
        list.add("Swaminarayan");

        // System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Sita");
        list1.add("Parvati");
        list1.add("Agni");
        list1.add("Aditi");
        list1.add("Radha");
        list1.add("Lakshmi");

        // System.out.println(list1);

        // list.addAll(list1);
        // System.out.println(list);

        // list.addAll(3,list1);
        // System.out.println(list);

        //we can also add list from specific index

        //System.out.println(list.get(0));

        // for (String god : list) {
        //     System.out.println(god);
        // }

        // list.clear();
        // System.out.println(list);

        Iterator<String> bhagwaans = list.iterator();
        // while (bhagwaans.hasNext()) {
        //     System.out.println(bhagwaans.next());
        // }
        // list.set(1, "Ramchandra");

        // System.out.println(list);

        // list.remove(2);
        
        System.out.println(list.remove("Ram"));

        // ArrayList<String> l1 = new ArrayList<>();
        // l1.add("Hanuman");
        // l1.add("Swaminarayan");

        // System.out.println(l1.size());
        // System.out.println(list.size());

        Object arr[] = list.toArray();
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        // String str = Arrays.toString(arr);
        System.out.println(Arrays.toString(arr));

        // System.out.println(list.contains("Hanuman"));

        // System.out.println(list.containsAll(l1));
        // System.out.println(list);
    }
}
