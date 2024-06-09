import java.util.HashMap;

public class Map_Hash {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Ram");
        map.put(2, "Krishna");
        map.put(3, "Shiva");
        map.put(4, "Ganesh");
        map.put(5, "Brahma");
        map.put(6,"Parshuram" );
        map.put(7,"Vishnu" );
        map.put(8,"Kalki" );
        map.put(9, "Narayan");
        map.put(10, "Kuber");
        map.put(11, "Indra");
        map.put(12, "Surya");
        map.put(13, "Chandra");
        map.put(14, "Yam");
        map.put(15, "Varun");
        map.put(16, "Vayu");
        map.put(17, "Agni");
        map.put(18, "Kamdev");
        map.put(19, "Narad");
        map.put(20, "Hanuman");

        System.out.println(map);
        // System.out.println("Size: " + map.size());
        // System.out.println(map.get(11));
        // System.out.println(map.isEmpty());
        // System.out.println(map.containsKey(14));
        // System.out.println(map.containsValue("Shiva"));

        // map.replace(1, "Ram", "Ramchandra");
        // System.out.println(map);
        
        // map.remove(11);
        // System.out.println(map);

        map.clear();
        System.out.println(map);

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(21, "Car");
        map1.put(22, "Car & Bike");
        map1.put(23, "Nothing");

        map1.putAll(map);
        System.out.println(map1);

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        //getOrDefault();
        System.out.println(map.getOrDefault(24, "Not Found"));

        //putIfAbsent()
        map.putIfAbsent(161, "Car");
        System.out.println(map);
    }
}
