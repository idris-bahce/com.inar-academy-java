package chapters.chapter11.exercises.Exercise11_11;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        fillTheList(list);
        printList(list);
        sort(list);
        printList(list);

    }

    private static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n--------------------------");
    }

    public static void sort(ArrayList<Integer> list){
        Collections.sort(list);
    }
    private static void fillTheList(ArrayList<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 10));
        }
    }
}
