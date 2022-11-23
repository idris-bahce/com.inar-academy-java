package chapters.chapter12.exercises.Exercise12_03;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[100];
        fillArray(arr);
        System.out.print("Enter the index of the array:");
        int i ;
        try {
            i = in.nextInt();
            System.out.println("Array's element in the index of " + i + " is " + arr[i] );
        }catch (IndexOutOfBoundsException io ){
            System.out.println("Out of Bounds");
        }
    }

    private static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }
}
