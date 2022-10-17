package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_09 {
    public static void main(String[] args) {
        char[][] xArr = new char[3][3];
        char[][] oArr = new char[3][3];
        String[][] tableArr = getTheTable();
        printTheTable(tableArr);
        int counter = 0;
        do {
            if (counter==9){
                tableArr = getTheTable();
                printTheTable(tableArr);
            }
            takeTheInputOfX(xArr);
            printTheNewTable(xArr, oArr, tableArr);
            printTheTable(tableArr);
            counter++;
            if (isThereAWinner(tableArr)) {
                char whoWins = whoWins(tableArr);
                System.out.println(whoWins + " player won.");
                break;
            }
            takeTheInputOfO(oArr);
            printTheNewTable(xArr, oArr, tableArr);
            printTheTable(tableArr);
            counter++;
            if (isThereAWinner(tableArr)) {
                char whoWins = whoWins(tableArr);
                System.out.println(whoWins + " player won.");
            }
        } while (!isThereAWinner(tableArr));
    }

    private static char whoWins(String[][] tableArr) {
        if ((tableArr[0][0].charAt(1) == 'X' && tableArr[0][1].charAt(1) == 'X' && tableArr[0][2].charAt(1) == 'X') ||
                (tableArr[1][0].charAt(1) == 'X' && tableArr[1][1].charAt(1) == 'X' && tableArr[1][2].charAt(1) == 'X') ||
                (tableArr[2][0].charAt(1) == 'X' && tableArr[2][1].charAt(1) == 'X' && tableArr[2][2].charAt(1) == 'X') ||
                (tableArr[0][0].charAt(1) == 'X' && tableArr[1][1].charAt(1) == 'X' && tableArr[2][2].charAt(1) == 'X') ||
                (tableArr[0][2].charAt(1) == 'X' && tableArr[1][1].charAt(1) == 'X' && tableArr[2][0].charAt(1) == 'X')) {
            return 'X';
        } else if ((tableArr[0][0].charAt(1) == 'O' && tableArr[0][1].charAt(1) == 'O' && tableArr[0][2].charAt(1) == 'O') ||
                (tableArr[1][0].charAt(1) == 'O' && tableArr[1][1].charAt(1) == 'O' && tableArr[1][2].charAt(1) == 'O') ||
                (tableArr[2][0].charAt(1) == 'O' && tableArr[2][1].charAt(1) == 'O' && tableArr[2][2].charAt(1) == 'O') ||
                (tableArr[0][0].charAt(1) == 'O' && tableArr[1][1].charAt(1) == 'O' && tableArr[2][2].charAt(1) == 'O') ||
                (tableArr[0][2].charAt(1) == 'O' && tableArr[1][1].charAt(1) == 'O' && tableArr[2][0].charAt(1) == 'O')) {
            return 'O';
        }
        return 'a';//This will never happen. we put it not to take mistake.
    }

    private static boolean isThereAWinner(String[][] tableArr) {

        if ((tableArr[0][0].charAt(1) == 'X' && tableArr[0][1].charAt(1) == 'X' && tableArr[0][2].charAt(1) == 'X') ||
                (tableArr[1][0].charAt(1) == 'X' && tableArr[1][1].charAt(1) == 'X' && tableArr[1][2].charAt(1) == 'X') ||
                (tableArr[2][0].charAt(1) == 'X' && tableArr[2][1].charAt(1) == 'X' && tableArr[2][2].charAt(1) == 'X') ||
                (tableArr[0][0].charAt(1) == 'X' && tableArr[1][1].charAt(1) == 'X' && tableArr[2][2].charAt(1) == 'X') ||
                (tableArr[0][2].charAt(1) == 'X' && tableArr[1][1].charAt(1) == 'X' && tableArr[2][0].charAt(1) == 'X')) {
            return true;
        } else if ((tableArr[0][0].charAt(1) == 'O' && tableArr[0][1].charAt(1) == 'O' && tableArr[0][2].charAt(1) == 'O') ||
                (tableArr[1][0].charAt(1) == 'O' && tableArr[1][1].charAt(1) == 'O' && tableArr[1][2].charAt(1) == 'O') ||
                (tableArr[2][0].charAt(1) == 'O' && tableArr[2][1].charAt(1) == 'O' && tableArr[2][2].charAt(1) == 'O') ||
                (tableArr[0][0].charAt(1) == 'O' && tableArr[1][1].charAt(1) == 'O' && tableArr[2][2].charAt(1) == 'O') ||
                (tableArr[0][2].charAt(1) == 'O' && tableArr[1][1].charAt(1) == 'O' && tableArr[2][0].charAt(1) == 'O')) {
            return true;
        }
        return false;
    }

    private static void printTheNewTable(char[][] xArr, char[][] oArr, String[][] tableArr) {

        for (int i = 0; i < xArr.length; i++) {
            for (int j = 0; j < xArr[i].length; j++) {
                if (xArr[i][j] == 'X') {
                    tableArr[i][j] = " X |";
                }
            }
        }
        for (int i = 0; i < oArr.length; i++) {
            for (int j = 0; j < oArr[i].length; j++) {
                if (oArr[i][j] == 'O') {
                    tableArr[i][j] = " O |";
                }
            }
        }
    }

    private static void printTheTable(String[][] tableArr) {
        System.out.println("-------------");
        for (int i = 0; i < tableArr.length; i++) {
            System.out.print("|");
            for (int j = 0; j < tableArr[i].length; j++) {
                System.out.print(tableArr[i][j]);
            }
            System.out.println("\n-------------");
        }
    }

    private static String[][] getTheTable() {
        String[][] tableArr = new String[3][3];
        for (int i = 0; i < tableArr.length; i++) {
            for (int j = 0; j < tableArr[i].length; j++) {
                tableArr[i][j] = "   |";
            }
        }
        return tableArr;
    }

    private static char[][] takeTheInputOfX(char[][] xArr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a row (0, 1, or 2) for player X:\nEnter a column (0, 1, or 2) for player X:");
        int indexRow ;
        int indexCol ;
        do {
            indexRow = in.nextInt();
            indexCol = in.nextInt();
            if ((indexCol < 0 || indexCol > 2) || (indexRow < 0 || indexRow > 2)) {
                System.out.println("Invalid input!!");
            } else {
                xArr[indexRow][indexCol] = 'X';
            }
        } while (((indexCol < 0 || indexCol > 2) || (indexRow < 0 || indexRow > 2)));
        return xArr;
    }

    private static char[][] takeTheInputOfO(char[][] oArr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a row (0, 1, or 2) for player O:\nEnter a column (0, 1, or 2) for player O:");
        int indexRow ;
        int indexCol ;
        do {
            indexRow = in.nextInt();
            indexCol = in.nextInt();
            if ((indexCol < 0 || indexCol > 2) || (indexRow < 0 || indexRow > 2)) {
                System.out.println("Invalid input!!");
            } else {
                oArr[indexRow][indexCol] = 'O';
            }
        } while ((indexCol < 0 || indexCol > 2) || (indexRow < 0 || indexRow > 2));
        return oArr;
    }
}
