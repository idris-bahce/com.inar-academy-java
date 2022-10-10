package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] list1 = getTheList1(in);
        int[] list2 = getTheList2(in);
        int[] mergedArr = merge(list1,list2);
        for (int i = 0; i < mergedArr.length; i++) {
            System.out.print(mergedArr[i] + " ");
        }
    }
    public static int[] merge(int[] list1, int[] list2){
        int[] arr = new int[list1.length+list2.length];
        for (int i = 0; i < list1.length; i++) {
            arr[i] = list1[i];
        }
        for (int i = 0; i < list2.length; i++) {
            arr[list1.length + i] = list2[i];
        }
        java.util.Arrays.sort(arr);
        return arr;
    }

    public static int[] getTheList1(Scanner in) {
        System.out.println("Enter the number of values:");
        int size = in.nextInt();
        int[] list1 = new int[size];
        System.out.println("Enter the values: ");
        for (int i = 0; i < list1.length; i++) {
            list1[i] = in.nextInt();
        }
        return list1;
    }

    public static int[] getTheList2(Scanner in) {
        System.out.println("Enter the number of values:");
        int size2 = in.nextInt();
        int[] list2 = new int[size2];
        System.out.println("Enter the values: ");
        for (int i = 0; i < list2.length; i++) {
            list2[i] = in.nextInt();
        }
        return list2;
    }
}
