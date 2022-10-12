package chapters.chapter07.exercises;

import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class Exercise7_16 {
    public static void main(String[] args) {
        int[] arr = getTheRandomlyGenerratedArray();
        int randomNumber = (int)(Math.random() * 10000000);

        printLinear(arr, randomNumber);

        printBinary(arr, randomNumber);
    }

    private static void printLinear(int[] arr, int randomNumber) {
        long startTime = System.currentTimeMillis();
        int result1 = getTheLinearSearch(arr, randomNumber);// sometimes randomly generated number isn't in the randomly generated array
        System.out.println("The number we search is in the " + result1 );
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Process of this task pasts " + executionTime + " milliseconds.");
    }

    private static void printBinary(int[] arr, int randomNumber) {
        long endTime;
        long executionTime;
        long startTime;
        sortTheArray(arr);
        startTime = System.currentTimeMillis();
        int result2 = binarySearch(arr, randomNumber);
        System.out.println("The number we search is in the " + result2);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Process of this task pasts " + executionTime + " milliseconds.");
    }
    public static void sortTheArray(int[] arr){
        Arrays.sort(arr);
    }

    public static int getTheLinearSearch(int[] arr, int randomNumber) {
       
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == randomNumber){
                return i;
            }
        }
        return  -1;
    }

    public static int[] getTheRandomlyGenerratedArray() {
        int[] arr = new int[10000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000000);
        }
        return arr;
    }
}
