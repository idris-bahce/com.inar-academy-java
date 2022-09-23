package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_28 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = in.nextInt();
		System.out.println("Enter the firs day of the year as an intiger:");
		int days = in.nextInt();
		
		String nameOfMonth = "";
		String nameOfDay = "";
		for (int month = 1; month <= 12; month++) {
			switch(month) {
			case 1:
				nameOfMonth = "January";
				break;
			case 2:
				nameOfMonth = "February";
				days+=31;
				break;
			case 3:
				nameOfMonth = "March";
				if((year % 4 == 0 && year % 100 !=0)||(year % 400 == 0)) {
					days+=29;
				}else {
					days+=28;
				}break;
			case 4:
				nameOfMonth = "April";
				days+=31;
				break;
			case 5:
				nameOfMonth = "May";
				days+=30;
				break;
			case 6:
				nameOfMonth = "June";
				days+=31;
				break;
			case 7:
				nameOfMonth = "July";
				days+=30;
				break;
			case 8:
				nameOfMonth = "August";
				days+=31;
				break;
			case 9:
				nameOfMonth = "September";
				days+=31;
				break;
			case 10:
				nameOfMonth = "October";
				days+=30;
				break;
			case 11:
				nameOfMonth = "November";
				days+=31;
				break;
			case 12:
				nameOfMonth = "December";
				days+=30;
				break;
			}
			days = days % 7;
			switch(days) {
			case 0: 
				nameOfDay = "Sunday";break;
			case 1:
				nameOfDay = "Monday";break;
			case 2: 
				nameOfDay = "Tuesday";break;
			case 3:
				nameOfDay = "Wednesday";break;
			case 4:
				nameOfDay = "Thursday";break;
			case 5:
				nameOfDay = "Friday";break;
			case 6:
				nameOfDay = "Saturday";break;
			}
			System.out.printf("\n%10s %2s %2d %2s %10s",nameOfMonth," 1, ", year," is ",nameOfDay);
		}
		
	}

}
