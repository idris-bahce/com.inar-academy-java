package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            int number = in.nextInt();
            arr[i] = number;
        }
        int[] newArray = eliminateDuplicates(arr);
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == 0){

            }else
                System.out.print(newArray[i] + " ");
        }
    }
    public static int[] eliminateDuplicates(int[] list){
        int[] array = new int[10];
        boolean isThereNumber = false;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (list[i] == array[j]){
                    isThereNumber = true;
                    break;
                }else {
                    isThereNumber = false;
                }
            }
            if (!isThereNumber){
                array[i] = list[i];
            }
        }
        return array;
    }
}
