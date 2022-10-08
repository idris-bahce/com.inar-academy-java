package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            double number = in.nextDouble();
            arr[i] = number;
        }
        System.out.println("The mean is: " + mean(arr));
        System.out.println("The deviation is: " + deviation(arr));
    }
    /** Compute the deviation of double values */
    public static double deviation(double[] x){
        double deviation = 0;
        double step1ToResult = 0;
        for (int i = 0; i < x.length; i++) {
            step1ToResult += Math.pow(x[i] - mean(x),2);
        }
        deviation = Math.sqrt(step1ToResult / (x.length - 1));
        return deviation;

    }
    /** Compute the mean of an array of double values */
    public static double mean(double[] x){
        double sum = 0;
        double mean = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        mean = sum / x.length;
        return mean;
    }
}
