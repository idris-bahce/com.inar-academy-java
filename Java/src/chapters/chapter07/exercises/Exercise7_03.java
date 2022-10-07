package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[50];
        int numbers = -1;
        java.util.Arrays.fill(arr,numbers);
        System.out.println("Enter the integer between 1 and 99: ");
        int index = 0;
        while (numbers!=0) {
            numbers = in.nextInt();
            if ((numbers < 0 || numbers > 99)) {
                System.out.println("Invalid input!!!");
                break;
            }
            if (index==arr.length - 1){//we have to enlarge the array.
               arr = getTheEnlargedArray(arr);
            }
            arr[index]=numbers;

            index++;
        }
        int[] counter = new int[100];
        counter = countTheInt(arr,counter);
        printTheOccurances(arr,counter);
    }

    public static void printTheOccurances(int[] arr, int[] counter) {
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == 0)
                continue;
            if(counter[i]>1) {
                System.out.println(i + " occurs " + counter[i] + " times.");
            }else
                System.out.println(i + " occurs " + counter[i] + " time.");
        }

    }

    public static int[] countTheInt(int[] arr, int[] counter) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0&&arr[i]!=-1) {
                counter[arr[i]]++;
            }
        }
        return counter;
    }

    public static int[] getTheEnlargedArray(int[] arr) {
        int[] newArray = new int[arr.length * 2];
        java.util.Arrays.fill(newArray, -1);
        System.arraycopy(arr, 0, newArray, 0, arr.length);// Copied the full array's elements into our new resized array
        arr = newArray;
        return newArray;
    }
}
