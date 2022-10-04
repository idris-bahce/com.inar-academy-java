package chapters.chapter07.listings;

import java.util.Scanner;

public class ArrayProcess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter the list of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
    }
}
