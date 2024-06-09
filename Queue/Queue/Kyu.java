import java.util.Iterator;
import java.util.PriorityQueue;

public class Kyu {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);

        System.out.println(q);

        Iterator<Integer> i = q.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + ", ");
        }
        
        System.out.println(q.poll());
        System.out.println(q.peek());

        System.out.println(q.size());

        System.out.println(q);
    }

}

/*
FIFO: First In First Out

Methods of Queue:
    1. offer() - add element to the end of the Queue
    2. remove() - remove element from the front of the Queue (throws an exception if element not present)
    3. peek() - return the element at the front of the Queue
    4. poll() - rmeove the element at the front of the Queue (shows null if element not present)
    5. size() - return the number of elements in the Queue
    6. isEmpty() - return true if the Queue is empty
    7. clear() - remove all elements from the Queue


*/
