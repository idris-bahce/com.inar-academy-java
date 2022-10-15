package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_04 {
    public static void main(String[] args) {
        int[][] employee = getTheWorkingHours();
        int[] eachWorkingHourOfEmployees = getTheSumOfTheHours(employee);
        int[] numberOfEmployees = getTheNumberOfEmployees(employee);
        getTheSortedListOfWorkingHourOfEmployees(eachWorkingHourOfEmployees, numberOfEmployees, employee);
        for (int i = 0; i < numberOfEmployees.length; i++) {
            System.out.println(numberOfEmployees[i] + ". employee works " + eachWorkingHourOfEmployees[i]
            + " hour in a week.");
        }
    }

    private static void getTheSortedListOfWorkingHourOfEmployees(int[] eachWorkingHourOfEmployees, int[] numberOfEmployees, int[][] employee) {
        for (int i = 0; i < numberOfEmployees.length - 1; i++) {
            for (int j = i + 1; j < numberOfEmployees.length; j++) {
                if (eachWorkingHourOfEmployees[i] < eachWorkingHourOfEmployees[j]) {
                    int temp = eachWorkingHourOfEmployees[i];
                    eachWorkingHourOfEmployees[i] = eachWorkingHourOfEmployees[j];
                    eachWorkingHourOfEmployees[j] = temp;
                    int temp2 = numberOfEmployees[i];
                    numberOfEmployees[i] = numberOfEmployees[j];
                    numberOfEmployees[j] = temp2;
                }
            }
        }
    }

    private static int[] getTheNumberOfEmployees(int[][] employee) {
        int[] arr = new int[employee.length];
        for (int i = 0; i < arr.length; i++) {//it goes 1 to employee.length
            arr[i] = i + 1;
        }
        return arr;
    }

    private static int[] getTheSumOfTheHours(int[][] employee) {
        int[] arr = new int[employee.length];
        for (int i = 0; i < employee.length; i++) {
            int sum = 0;
            for (int j = 0; j < employee[i].length; j++) {
                sum += employee[i][j];
            }
            arr[i] = sum;
        }
        return arr;
    }

    private static int[][] getTheWorkingHours() {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[8][7];
        for (int emloyee = 0; emloyee < arr.length; emloyee++) {
            for (int days = 0; days < arr[emloyee].length; days++) {
                arr[emloyee][days] = in.nextInt();
            }
        }
        return arr;
    }
}
