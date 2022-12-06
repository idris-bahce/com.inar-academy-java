package arraylist.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double>[] lists = new ArrayList[3];
        System.out.println("Enter a 3*3 array to sort: ");
        for (int i = 0; i < lists.length; i++) {
            lists[i] = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                double a = in.nextDouble();
                lists[i].add(a);
            }
        }
        printList(lists);
        sort(lists);
        System.out.println("-------------------");;
        printList(lists);
    }

    private static void printList(ArrayList<Double>[] lists) {
        for (int i = 0; i < lists.length; i++) {
            System.out.println(lists[i]);
        }
    }

    public static void sort(ArrayList<Double>[] lists){
        for (int i = 0; i < lists.length; i++) {
            for (int j = 0; j < lists[i].size()-1; j++) {
                for (int k = 1; k < lists[i].size(); k++) {
                    if (lists[i].get(j)>lists[i].get(k)){
                        double temp = lists[i].get(j);
                        lists[i].set(j,lists[i].get(k));
                        lists[i].set(k,temp);
                    }
                }
            }
        }
    }
}
