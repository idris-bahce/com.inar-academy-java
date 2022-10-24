package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_36 {
    public static void main(String[] args) {
        char[][] arr = getTheArray();
        if (arr.length < 3) {
            System.out.println("Invalid input!");
        } else if (arr[0][0] != 'A' || arr[0][1] != 'B' || arr[0][2] != 'C') {
            System.out.println("Wrong input: the letters must be from A to C.");
        } else if (isOnlyOneIncolumn(arr)&&isOnlyOneInRow(arr)){
            System.out.println("The input array is a latin square.");
        }
    }

    private static boolean isOnlyOneInRow(char[][] arr) {
        boolean isAllTrue = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i].length; k++) {
                    if (j==k){
                        continue;
                    }
                    if (arr[i][j]!=arr[i][k]){
                        isAllTrue = true;
                    }else {
                        return false;
                    }
                }
            }
        }
        return isAllTrue;
    }

    private static boolean isOnlyOneIncolumn(char[][] arr) {
        boolean isAllTrue = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (j==k){
                        continue;
                    }
                    if (arr[j][i]!=arr[k][i]){
                        isAllTrue = true;
                    }else {
                        return false;
                    }
                }
            }
        }
        return isAllTrue;

    }

    private static char[][] getTheArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n = in.nextInt();
        System.out.println("Enter 4 rows of letters separated by spaces: ");
        char[][] arr = new char[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                arr[i][j] = in.next().charAt(0);
            }
        }
        return arr;
    }
}
