package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter ten integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        if(isSorted(arr)){
            System.out.println("The list is already sorted.");
        }else
            System.out.println("The list is not sorted.");
    }

    public static boolean isSorted(int[] arr) {
        boolean isTrue = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    isTrue = true;
                }else {
                    isTrue = false;
                    break;
                }
            }
        }
        if (isTrue){
            return true;
        }else
            return false;
    }
}
