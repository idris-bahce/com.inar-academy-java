package chapters.chapter11.listings;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter integers (input ends with 0): ");
        int a;
        while (true){
            a = in.nextInt();
            if (a == 0){
                break;
            } else if (!integers.contains(a)) {
                integers.add(a);
            }
        }
        for (Integer ab :
                integers) {
            System.out.print(ab + " ");
        }
    }
}
