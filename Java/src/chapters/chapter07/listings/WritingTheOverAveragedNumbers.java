package chapters.chapter07.listings;

import java.util.Scanner;

public class WritingTheOverAveragedNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the scale of the array: ");
        int scale = in.nextInt();
        double[] arr = new double[scale];

        for (int i = 0; i < scale; i++) {
            System.out.println("Enter numbers: ");
            double num = in.nextDouble();
            arr[i] = num;
        }
        System.out.println( "Here is the numbers which are over the average: " + numberOfOverAveragedNumbers(arr));
    }

    private static int numberOfOverAveragedNumbers(double[] arr) {
        int counter = 0;//this counter counts the number of overaveraged numbers
        for (int i = 0; i < arr.length; i++) {
            if(averageOfArray(arr)< arr[i]){
                counter++;
            }
        }
        return counter;
    }

    public static double averageOfArray(double[] arr) {
        double average = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        average = sum / arr.length;
        return average;
    }
}
