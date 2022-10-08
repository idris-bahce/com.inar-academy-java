package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] array = new double[10];
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            int numbers = in.nextInt();
            array[i] = numbers;
        }
        System.out.println( average(array));

    }
    public static int average(int[] array){
        int sum = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        return average;
    }
    public static double average(double[] array){
        double sum = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        return average;
    }
}
