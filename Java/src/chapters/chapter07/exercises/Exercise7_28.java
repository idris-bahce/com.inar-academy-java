package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_28 {
    public static void main(String[] args) {
        int liner = 0;
        int[] arr = getTheNumbersFromUser();
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print(" " + arr[i] + "," + arr[j]);
                liner++;
                if (liner % 10 == 0){
                    System.out.println();
                }
            }


        }

    }

    private static int[] getTheNumbersFromUser() {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter ten integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }
}
