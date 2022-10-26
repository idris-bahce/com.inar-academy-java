package chapters.chapter09.checkpoints;

import chapters.chapter09.listings.Circle;

public class CheckPoint9_19 {
    public static void main(String[] args) {
        // method1();The main method is static and cannot invoke the instance method method1.
         }

         public void method1() {
         method2();
         }

         public static void method2() {
        // System.out.println("What is radius " + c.getRadius());c is an instance variable, which cannot be accessed from the static context in method2.
         }

}
