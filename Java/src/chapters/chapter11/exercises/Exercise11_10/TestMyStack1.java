package chapters.chapter11.exercises.Exercise11_10;

import java.util.Scanner;

public class TestMyStack1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter five strings:");
        MyStack1 myStack1 = new MyStack1();
        for (int i = 0; i < 5; i++) {
            String s = in.nextLine();
            myStack1.add(s);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(myStack1.pop());
        }
    }
}
