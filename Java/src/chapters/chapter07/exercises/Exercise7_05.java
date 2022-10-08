package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the numbers: ");
        int numberCounter = 0;
        int index = 0;
        while (numberCounter<10){
            int number = input.nextInt();
            if (numberCounter == 0){
                arr[index] = number;
            }
            if(!isArrayContains(arr,number)){
                index++;
                arr[index]=number;
            }
            numberCounter++;
        }
        printTheNumberOfDistinctNumbers(arr);
        printArray(arr);
    }

    public static void printTheNumberOfDistinctNumbers(int[] arr) {
        int distinctNumberCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                distinctNumberCounter++;
            }
        }
        System.out.println("The number of distinct number: " + distinctNumberCounter);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static boolean isArrayContains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (number==arr[i]){
                return true;
            }
        }
        return false;
    }
}
