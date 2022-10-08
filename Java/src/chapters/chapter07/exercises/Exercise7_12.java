package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        arr = getTheReversedArray(arr);
        printTheReversedArray(arr);
    }

    private static void printTheReversedArray(int[] arr) {
        for (int a :
                arr) {
            System.out.print(a + " ");
        }
    }

    public static int[] getTheReversedArray(int[] arr) {

        for (int i = 0,j = arr.length - 1; i < arr.length/2; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
