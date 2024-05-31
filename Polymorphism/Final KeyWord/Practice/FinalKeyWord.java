class Bike {
    final int speedLimit = 90;

    final void run() {
        System.out.println("Final run method");
    }
}

class Suzuki extends Bike{
    
    void run1() {
        System.out.println("running safely with 100kmp");
        super.run();
    }
    //WE CANNOT OVERRIDE FINAL METHOD IN CHILD CLASS
}

public class FinalKeyWord {
     public static void main(String[] args) {
         Suzuki hayabusa = new Suzuki();
         hayabusa.run1();
         System.out.println(hayabusa.speedLimit);
     }
}
