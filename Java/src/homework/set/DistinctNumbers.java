package homework.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(in.nextInt());
        }
        System.out.println("The number of distinct number is " + set.size());
        System.out.println(set);
    }
}
