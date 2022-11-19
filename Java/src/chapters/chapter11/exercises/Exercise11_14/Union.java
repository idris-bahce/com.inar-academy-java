package chapters.chapter11.exercises.Exercise11_14;

import java.util.ArrayList;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        fillTheArrays(list1,list2);
        ArrayList<Integer> united = union(list1,list2);
        System.out.print("The combined list is:");
        for (int i = 0; i < united.size(); i++) {
            System.out.print(united.get(i) + " ");
        }
    }
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> united = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            united.add(list1.get(i));
        }
        for (int i = list1.size(),k=0; i < list2.size() + list1.size(); i++,k++) {
            united.add(list2.get(k));
        }
        return united;
    }
    private static void fillTheArrays(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter five integers for the first array:");
        for (int i = 0; i < 5; i++) {
            list1.add(in.nextInt());
        }
        System.out.println("Enter five integers for the second array:");
        for (int i = 0; i < 5; i++) {
            list2.add(in.nextInt());
        }
    }
}
