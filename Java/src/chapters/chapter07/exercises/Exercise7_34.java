package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = in.next();
        char[] arr = sortTheString(str);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static char[] sortTheString(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }
        java.util.Arrays.sort(arr);
        return arr;
    }
}
