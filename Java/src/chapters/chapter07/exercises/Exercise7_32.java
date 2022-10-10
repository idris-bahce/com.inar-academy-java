package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] list = getTheList(in);
        int indexOfPivot = partition(list);
        System.out.print("After the partition, the list is ");
        printTheList(indexOfPivot, list);
    }

    public static void printTheList(int indexOfPivot, int[] list) {

        for (int i = 0; i < indexOfPivot; i++) {
            int temp = list[i];
            list[i] = list[i + 1];
            list[i + 1] = temp;
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] > list[indexOfPivot]){
                swapWithAfterIndexValues(list,indexOfPivot,i);
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void swapWithAfterIndexValues(int[] list, int indexOfPivot,int k) {

        for (int i = indexOfPivot; i < list.length; i++) {
            if (list[i]<list[indexOfPivot]){
                int temp = list[i];
                list[i] = list[k];
                list[k] = temp;
            }
        }
    }

    public static int partition(int[] list) {
        int index = 0;//we are going to count the indexes to find which index we will put the pivot.
        for (int i = 0; i < list.length; i++) {
            if (list[0] > list[i]) {
                index ++;
            }
        }
        return index;
    }

    public static int[] getTheList(Scanner in) {
        System.out.println("Enter the number of values:");
        int size = in.nextInt();
        int[] list1 = new int[size];
        System.out.println("Enter the values: ");
        for (int i = 0; i < list1.length; i++) {
            list1[i] = in.nextInt();
        }
        return list1;
    }
}
