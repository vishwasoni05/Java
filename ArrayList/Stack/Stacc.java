import java.util.Stack;

public class Stacc {
    public static void main(String[] args) {
        Stack<Integer> nums = new Stack<>();

        nums.push(45);
        nums.push(56);
        nums.push(44);
        nums.push(23);
        nums.push(90);
        nums.push(78);

        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println("peek(): " + nums.peek());
        System.out.println("search(45): " + nums.search(45));
        System.out.println("search(56): " + nums.search(56));
        System.out.println("search(44): " + nums.search(44));
        System.out.println("search(23): " + nums.search(23));
        System.out.println("search(90): " + nums.search(90));
        System.out.println("search(78): " + nums.search(78));
        System.out.println("pop(): " + nums.pop());
        System.out.println("peek(): " + nums.peek());
        System.out.println("search(23): " + nums.search(23));
        System.out.println("peek(): " + nums.peek());
        System.out.println("peek(): " + nums.peek());
        nums.clear();
        System.out.println(nums.empty());
        System.out.println(nums.size());
    }
}
