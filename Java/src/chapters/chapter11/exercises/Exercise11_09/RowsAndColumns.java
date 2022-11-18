package chapters.chapter11.exercises.Exercise11_09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RowsAndColumns {
    public static void main(String[] args) {
        int n = takeInput();
        ArrayList<Integer>[] lists = new ArrayList[n];
        fillTheArray(lists,n);
        printArray(lists);
        findTheLargestRowAndColumn(lists);
    }

    private static void findTheLargestRowAndColumn(ArrayList<Integer>[] lists) {
        int rowCounter = 0;
        int colCounter;
        int maxRow = -1;
        int maxCol;
        ArrayList<Integer> listOfColCounters = new ArrayList<>();
        ArrayList<Integer> listOfRowCounters = new ArrayList<>();

        for (int i = 0; i < lists.length; i++) {
            colCounter = 0;
            for (int j = 0; j < lists[i].size(); j++) {
                if (lists[i].get(j) == 1){
                    colCounter++;
                }
            }
            listOfColCounters.add(colCounter);
        }
        int maxNumberOfColumn = Collections.max(listOfColCounters);
        maxCol = listOfColCounters.indexOf(maxNumberOfColumn);

        for (int i = 0; i < lists.length; i++) {
            rowCounter = 0;
            for (int j = 0; j < lists[i].size(); j++) {
                if (lists[j].get(i) == 1){
                    rowCounter++;
                }
            }
            listOfRowCounters.add(rowCounter);
        }
        int maxNumberOfRow = Collections.max(listOfRowCounters);
        maxRow = listOfRowCounters.indexOf(maxNumberOfRow);

        System.out.println("The largest row index: " + maxRow
        + "\nThe largest column index: " + maxCol);
    }

    private static void printArray(ArrayList<Integer>[] lists) {
        for (int i = 0; i < lists.length; i++) {
            for (int j = 0; j < lists[i].size(); j++) {
                System.out.print(lists[i].get(j) + " ");
            }
            System.out.println();
        }
    }

    private static void fillTheArray(ArrayList<Integer>[] lists, int n) {
        for (int i = 0; i < lists.length; i++) {
            lists[i] = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                lists[i].add((int) (Math.random() * 2));
            }
        }
    }

    private static int takeInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter columns and rows: ");
        int n = in.nextInt();
        return n;
    }
}
