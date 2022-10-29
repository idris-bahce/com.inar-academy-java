package chapters.chapter09.exercises.Exercise9_05;

import java.util.GregorianCalendar;

public class Gregorian {
    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar();
        displayCurrentDate(date);
        GregorianCalendar date2 = new GregorianCalendar();
        date.setTimeInMillis(1234567898765L);
        displayCurrentDate(date);
    }

    private static void displayCurrentDate(GregorianCalendar date) {
        System.out.print("Current date in Gregorian calender is(day/month/year):");
        System.out.print(date.get(date.DAY_OF_MONTH) + "/" + date.get(date.MONTH) + "/" + date.get(date.YEAR));
        System.out.println();
    }
}
