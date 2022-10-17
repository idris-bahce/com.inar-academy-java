package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_09 {
    public static void main(String[] args) {
        char[][] xArr = new char[3][3];
        char[][] oArr = new char[3][3];
        String[][] tableArr = getTheTable();
        printTheTable(tableArr);
        takeTheInputOfX(xArr);
        takeTheInputOfO(oArr);
        
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
                tableArr[i][j]= "   |";
            }
        }
        return tableArr;
    }

    private static char[][] takeTheInputOfX(char[][]xArr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a row (0, 1, or 2) for player X:\nEnter a column (0, 1, or 2) for player X:");
        int indexRow = in.nextInt();
        int indexCol = in.nextInt();
        do {
            if ((indexCol < 0 || indexCol > 2) || (indexRow < 0 || indexRow > 2)) {
                System.out.println("Invalid input!!");
            } else {
                xArr[indexRow][indexCol] = 'X';
            }
        }while ((indexCol < 0 || indexCol > 2) || (indexRow < 0 || indexRow > 2)) ;
        return xArr;
    }
    private static char[][] takeTheInputOfO(char[][]oArr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a row (0, 1, or 2) for player X:\nEnter a column (0, 1, or 2) for player X:");
        int indexRow = in.nextInt();
        int indexCol = in.nextInt();
        do {
            if ((indexCol < 0 || indexCol > 2) || (indexRow < 0 || indexRow > 2)) {
                System.out.println("Invalid input!!");
            } else {
                oArr[indexRow][indexCol] = 'X';
            }
        }while ((indexCol < 0 || indexCol > 2) || (indexRow < 0 || indexRow > 2)) ;
        return oArr;
    }
}
