package homework.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Combine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter five integers for set1: ");
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            set1.add(in.nextInt());
        }
        System.out.print("Enter five integers for set2: ");
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            set2.add(in.nextInt());
        }
        System.out.println("The combined list is: " + united(set1,set2));
    }

    private static Set<Integer> united(Set<Integer> set1, Set<Integer> set2) {
        for (int a : set1) {
            set2.add(a);
        }
        return set2;
    }

}
