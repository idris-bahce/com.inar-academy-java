package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int notes = 0;
        int[] listOfNotes = new int[50];
        java.util.Arrays.fill(listOfNotes, -1);
        int index = 0;
        System.out.println("Enter the notes (Enter -2 to end the notes):");
        while (notes >= 0) {
            notes = in.nextInt();
            listOfNotes[index] = notes;
            if (index == listOfNotes.length - 1) {//here we need to extend the array
                listOfNotes = newExtendedArray(listOfNotes);
            }

            index++;
        }
        double averageNote = getTheAverageOfArray(listOfNotes);
        printTheNumbersOfStudentsWhoAreAboveOrBelowOrInTheAverage(listOfNotes, averageNote);
    }

    public static void printTheNumbersOfStudentsWhoAreAboveOrBelowOrInTheAverage(int[] listOfNotes, double average) {
        int counterAboveAverage = 0;
        int counterBelowAverage = 0;
        int counterInAverage = 0;
        for (int i = 0; i < listOfNotes.length; i++) {
            if (listOfNotes[i] >= 0) {
                if (listOfNotes[i] == average) {
                    counterInAverage++;
                } else if (listOfNotes[i] < average) {
                    counterBelowAverage++;
                } else {
                    counterAboveAverage++;
                }
            }
        }
        System.out.println("Number of students who are above average is: " + counterAboveAverage);
        System.out.println("Number of students who in the average is: " + counterInAverage);
        System.out.println("Number of students who are below average is: " + counterBelowAverage);
    }

    public static double getTheAverageOfArray(int[] listOfNotes) {
        double sum = 0;
        double noteCounter = 0;
        for (int i = 0; i < listOfNotes.length; i++) {
            if (listOfNotes[i] >= 0) {
                sum += listOfNotes[i];
                noteCounter++;
            }
        }
        return sum / noteCounter;
    }

    public static int[] newExtendedArray(int[] listOfNotes) {
        int[] newArray = new int[listOfNotes.length * 2];
        java.util.Arrays.fill(newArray, -1);
        System.arraycopy(listOfNotes, 0, newArray, 0, listOfNotes.length);
        return newArray;
    }
}
