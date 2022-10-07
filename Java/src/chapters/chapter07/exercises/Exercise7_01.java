package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of the students: ");
        int numOfStudents = in.nextInt();
        System.out.println("Enter the scores:");
        int[] arrOfStudents = getTheArray(numOfStudents);
        for (int i = 0; i < arrOfStudents.length; i++) {
            arrOfStudents[i] = in.nextInt();
        }
        int maxGrade = getTheMaxGrade(arrOfStudents);
        printTheGradesOfStudents(arrOfStudents,maxGrade);
    }

    public static void printTheGradesOfStudents(int[] arrOfStudents, int maxGrade) {
        for (int i = 0; i < arrOfStudents.length; i++) {
            if (arrOfStudents[i]>= maxGrade -10){
                System.out.println("Student " + i + "'s score is: " + arrOfStudents[i] + " is A");
            }else if (arrOfStudents[i]>= maxGrade -20){
                System.out.println("Student " + i + "'s score is: " + arrOfStudents[i] + " is B");
            }else if (arrOfStudents[i]>= maxGrade -30){
                System.out.println("Student " + i + "'s score is: " + arrOfStudents[i] + " is C");
            }else if (arrOfStudents[i]>= maxGrade -40){
                System.out.println("Student " + i + "'s score is: " + arrOfStudents[i] + " is D");
            }else
                System.out.println("Student " + i + "'s: " + arrOfStudents[i] + " is F");
        }
    }

    public static int getTheMaxGrade(int[] arrOfStudents) {
        int max = 0;
        for (int i = 0; i < arrOfStudents.length; i++) {
            if (arrOfStudents[i]>max){
                max = arrOfStudents[i];
            }
        }return max;
    }

    public static int[] getTheArray(int num) {
        int[] arr = new int[num];
        return arr;
    }
}
