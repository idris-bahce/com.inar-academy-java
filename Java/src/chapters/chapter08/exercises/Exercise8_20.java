package chapters.chapter08.exercises;

import java.util.Scanner;


public class Exercise8_20 {
    public static void main(String[] args) {
        char[][] arr = new char[6][7];
        for (int i = 0; i < arr.length; i++) {
            java.util.Arrays.fill(arr[i], ' ');
        }
        printTheArray(arr);
        while (!isSomeoneWon(arr)) {
            getTheInputOfRed(arr);
            if (isThere4ConsecutiveInRow(arr) || isThere4ConsecutiveInCol(arr) || isThere4ConsecutiveInDiagonal(arr)) {
                printTheArray(arr);
                System.out.println("Red won");
                break;
            }
            printTheArray(arr);
            getTheInputOfYellow(arr);
            if (isThere4ConsecutiveInRow(arr) || isThere4ConsecutiveInCol(arr) || isThere4ConsecutiveInDiagonal(arr)) {
                printTheArray(arr);
                System.out.println("Yellow won!");
                break;
            }
            printTheArray(arr);
        }
    }

    private static boolean isThere4ConsecutiveInDiagonal(char[][] arr) {
        for (int row = 3; row < arr.length; row++) {
            int col = 0;
            int row2 = row;
            int col2 = col;
            for (int i = row; i >= 3; i--) {
                int loopController = 0;
                int k = 1;
                int l = 1;
                int trueCounter = 0;
                while (loopController < 3) {//because we are looking for 4 consecutive number, and we count 0 too.
                    if ((arr[row2][col2] == arr[row2 - k][col2 + l]) && arr[row2][col2] != ' ' && arr[row2 - k][col2 + l] != ' ') {
                        trueCounter++;
                        if (trueCounter == 3) {
                            return true;
                        }
                    }
                    l++;
                    k++;
                    loopController++;
                }
                row2--;
                col2++;
            }
        }
        int col = 1;
        for (int row = arr.length - 1; row >= 3; row--) {
            int row2 = arr.length - 1;
            int col2 = col;
            for (int i = row; i >= 3; i--) {
                int loopController = 0;
                int k = 1;
                int l = 1;
                int trueCounter = 0;
                while (loopController < 3) {//because we are looking for 4 consecutive number, and we count 0 too.
                    if ((arr[row2][col2] == arr[row2 - k][col2 + l]) && arr[row2][col2] != ' ' && arr[row2 - k][col2 + l] != ' ') {
                        trueCounter++;
                        if (trueCounter == 3) {
                            return true;
                        }
                    }
                    l++;
                    k++;
                    loopController++;
                }
                row2--;
                col2++;
            }
            col++;
        }
        int secondLoopIterator = 1;
        for (int row = arr.length - 4; row >= 0; row--) {
            int row2 = row;
            int col2 = arr[0].length - 1;
            for (int i = secondLoopIterator; i > 0; i--) {
                int loopController = 0;
                int k = 1;
                int l = 1;
                int trueCounter = 0;
                while (loopController < 3) {//because we are looking for 4 consecutive number, and we count 0 too.
                    if ((arr[row2][col2] == arr[row2 + k][col2 - l]) && arr[row2][col2] != ' ' && arr[row2 + k][col2 - l] != ' ') {
                        trueCounter++;
                        if (trueCounter == 3) {
                            return true;
                        }
                    }
                    l++;
                    k++;
                    loopController++;
                }
                row2++;
                col2--;
            }
            secondLoopIterator++;
        }
        int row = 0;
        secondLoopIterator = 0;
        for (int col3 = arr.length - 1; col3 >= 3; col3--) {
            int row2 = row;
            int col2 = col3;
            for (int i = secondLoopIterator; i < 3; i++) {
                int loopController = 0;
                int k = 1;
                int l = 1;
                int trueCounter = 0;
                while (loopController < 3) {//because we are looking for 4 consecutive number, and we count 0 too.
                    if ((arr[row2][col2] == arr[row2 + k][col2 - l]) && arr[row2][col2] != ' ' && arr[row2 + k][col2 - l] != ' ') {
                        trueCounter++;
                        if (trueCounter == 3) {
                            return true;
                        }
                    }
                    l++;
                    k++;
                    loopController++;
                }
                row2++;
                col2--;
            }
            secondLoopIterator++;
        }
        return false;
    }

    private static boolean isThere4ConsecutiveInCol(char[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length - 3; j++) {
                int fourCounter = 0;
                for (int k = j + 1; k <= j + 3; k++) {
                    if ((arr[j][i] == arr[k][i]) && arr[j][i] != ' ' && arr[k][i] != ' ') {
                        fourCounter++;
                        if (fourCounter == 3) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean isThere4ConsecutiveInRow(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 3; j++) {
                int fourCounter = 0;
                for (int k = j + 1; k <= j + 3; k++) {
                    if ((arr[i][j] == arr[i][k]) && arr[i][j] != ' ' && arr[i][k] != ' ') {
                        fourCounter++;
                        if (fourCounter == 3) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean isSomeoneWon(char[][] arr) {
        if (isThere4ConsecutiveInRow(arr) || isThere4ConsecutiveInCol(arr) || isThere4ConsecutiveInDiagonal(arr)) {
            return true;
        } else if (noOneWins(arr)) {
            System.out.println("Nobody wins. Try again!");
        }
        return false;
    }

    private static boolean noOneWins(char[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            if (arr[0][i]!=' '){
                return true;
            }
        }
        return false;
    }

    private static void getTheInputOfYellow(char[][] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Drop a yellow disk at column (0–6):");
        int yellow = in.nextInt();
        while (0 < yellow || yellow > 6){
            yellow = in.nextInt();
            System.out.println("Invalid input!!");
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i][yellow] != 'R' && arr[i][yellow] != 'Y') {
                arr[i][yellow] = 'Y';
                break;
            }
        }
    }

    private static void getTheInputOfRed(char[][] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Drop a red disk at column (0–6):");
        int red = in.nextInt();
        while (0 < red || red > 6){
            red = in.nextInt();
            System.out.println("Invalid input!!");
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i][red] != 'R' && arr[i][red] != 'Y') {
                arr[i][red] = 'R';
                break;
            }
        }

    }

    private static void printTheArray(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("|");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }
}
