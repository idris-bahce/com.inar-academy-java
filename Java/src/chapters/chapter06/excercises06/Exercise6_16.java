package chapters.chapter06.excercises06;

import chapters.chapter06.listings06.PrintCalender;

import java.util.Scanner;

public class Exercise6_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the years that you want the days amount:");
        int year1 = in.nextInt();
        int year2 = in.nextInt();
        int sum = 0;
        for (int i = year1; i <= year2 ; i++) {
            sum+=numberOfDaysInAYear(i);
        }
        System.out.println("Number of days between " + year1 + " and " + year2 + " is: " + sum);
    }

    public static int numberOfDaysInAYear(int year) {
        int day = 0;
        if (PrintCalender.isLeapYear(year)) {
            day = 366;
        } else {
            day = 365;
        }
        return day;
    }
}
