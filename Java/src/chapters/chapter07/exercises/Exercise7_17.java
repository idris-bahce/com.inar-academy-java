package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = in.nextInt();
        int[] arrScores = new int[numberOfStudents];
        String[] arrNames = new String[numberOfStudents];
        System.out.println("Enter the names and later score of the students: ");
        for (int i = 0; i < arrScores.length; i++) {
            String names = in.next();
            arrNames[i] = names;
            int scores = in.nextInt();
            arrScores[i] = scores;
        }
        arrScores = getTheSortedScores(arrScores,arrNames);
        for (int i = 0; i < arrScores.length; i++) {
            System.out.println(arrNames[i] + "'s score is " + arrScores[i]);
        }
    }



    public static int[] getTheSortedScores(int[] arrScores, String[] arrNames) {
        for (int i = 0; i < arrScores.length - 1; i++) {
            for (int j = 1; j < arrScores.length ; j++) {
                if (arrScores[i]<arrScores[j]){
                    String temp2 = arrNames[i];
                    int temp = arrScores[i];
                    arrNames[i] = arrNames[j];
                    arrScores[i] = arrScores[j];
                    arrNames[j] = temp2;
                    arrScores[j] = temp;
                }
            }
        }
        return arrScores;
    }
}
