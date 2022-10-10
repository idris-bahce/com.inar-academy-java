package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of values:");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        if (isConsecutive(arr)){
            System.out.println("The list has consecutive fours");
        }else
            System.out.println("The list has no consecutive fours");
    }

    private static boolean isConsecutive(int[] arr) {

        int equalityCounter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1]){
                equalityCounter++;
            }
        }
        if (equalityCounter>=3)//we put here 3 instead of 4 because we can scan 4 consecutive numbers with 3 steps.
            return true;
        else
            return false;
    }
}
