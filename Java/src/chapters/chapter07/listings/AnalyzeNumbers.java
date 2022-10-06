package chapters.chapter07.listings;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = in.nextInt();
        double[] arr = new double[n];
        System.out.println("Enter the items: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextDouble();
        }
        System.out.println("Average of this array is:" + getTheAverage(arr));
        System.out.println("Number of the elements above the average is: " + getTheNumberOfTheOverAveragedNumbers(arr) );

    }

    public static int getTheNumberOfTheOverAveragedNumbers(double[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>getTheAverage(arr)){
                counter++;
            }
        }
        return  counter;
    }

    public static double getTheAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / arr.length;
        return average;
    }
}
