package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_27 {
    public static void main(String[] args) {
        double[][] arr = getTheArray();
        double[][] arr2 = getTheArray();
        if (equals(arr,arr2)){
            System.out.println("The two arrays are strictly identical.");
        }else
            System.out.println("The two arrays are not strictly identical");
    }
    public static boolean equals(double[][] arr, double[][] arr2){
        boolean isAllSame = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==arr2[i][j]){
                    isAllSame = true;
                }else {
                    return false;
                }
            }
        }
        if (isAllSame){
            return true;
        }else
            return false;
    }
    private static double[][] getTheArray() {
        double[][] arr = new double[3][3];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3*3 array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
        return arr;
    }
}
