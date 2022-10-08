package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] array = new double[10];
        System.out.println("Enter ten numbers to get the minimum:");
        for (int i = 0; i < 10; i++) {
            double number = in.nextDouble();
            array[i] = number;
        }
        System.out.println("The minimum number is: " + min(array));

    }

    public static double min(double[] array){
        double min = 100;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
