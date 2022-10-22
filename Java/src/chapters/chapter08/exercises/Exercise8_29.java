package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_29 {
    public static void main(String[] args) {
        int[][] arr = getTheArray();
        int[][] arr2 = getTheArray();
        if (equals(arr, arr2)) {
            System.out.println("The two arrays are identical.");
        } else
            System.out.println("The two arrays are not identical");
    }

    public static boolean equals(int[][] arr, int[][] arr2) {
        boolean isAllTrue = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                isAllTrue = false;
                for (int k = 0; k < arr.length; k++) {
                    if (isAllTrue) {
                    break;
                }
                    for (int l = 0; l < arr[k].length; l++) {
                        if (arr[i][j] == arr2[k][l]) {
                            isAllTrue = true;
                            break;
                        }
                    }
                    if (k == (arr.length-1) && !isAllTrue) {
                        return false;
                    }
                }
            }
        }
        if (isAllTrue) {
            return true;
        } else
            return false;
    }

    private static int[][] getTheArray() {
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3*3 array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        return arr;
    }
}
