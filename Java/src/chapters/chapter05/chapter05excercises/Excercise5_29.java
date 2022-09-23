package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_29 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = in.nextInt();
		System.out.println("Enter the first day of the year:(1-7) ");
		int day = in.nextInt();
		String nameOfMonth = "";
		int counter = 1 + day;
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		for (int month = 1; month <= 12; month++) {
			int dayAmount = 31;
			switch (month) {
			case 1:
				nameOfMonth = "January";
				break;
			case 2:
				nameOfMonth = "February";
				day = (day + 31) % 7 ;
				if (isLeapYear) {
					dayAmount = 29;
				} else {
					dayAmount = 28;
				}
				break;
			case 3:
				nameOfMonth = "March";
				if(isLeapYear) {
					day = (day + 29) % 7 ;
				}else
					day = (day + 28) % 7 ;
				dayAmount = 31;
				break;
			case 4:
				nameOfMonth = "April";
				day = (day + 31) % 7 ;
				dayAmount = 30;
				break;
			case 5:
				nameOfMonth = "May";
				day = (day + 30) % 7 ;
				dayAmount = 31;
				break;
			case 6:
				nameOfMonth = "June";
				day = (day + 31) % 7 ;
				dayAmount = 30;
				break;
			case 7:
				nameOfMonth = "July";
				day = (day + 30) % 7 ;
				dayAmount = 31;
				break;
			case 8:
				nameOfMonth = "August";
				day = (day + 31) % 7 ;
				dayAmount = 31;
				break;
			case 9:
				nameOfMonth = "September";
				day = (day + 31) % 7 ;
				dayAmount = 30;
				break;
			case 10:
				nameOfMonth = "October";
				day = (day + 30) % 7 ;
				dayAmount = 31;
				break;
			case 11:
				nameOfMonth = "November";
				day = (day + 31) % 7 ;
				dayAmount = 30;
				break;
			case 12:
				nameOfMonth = "December";
				day = (day + 30) % 7 ;
				dayAmount = 31;
				break;
			}

			System.out.println("\t\t      " + nameOfMonth + " " + year);
			System.out.println("---------------------------------------------------");
			System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
			for (int j = 0; j < day; j++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= dayAmount; j++) {
				System.out.printf("%3d\t", j);
				if (counter % 7 == 0) {
					System.out.println();
				}
				counter++;
			}
			System.out.println();

		}
	}
}
