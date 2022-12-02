package chapters.chapter13.exercises.Exercise13_04;

import java.util.GregorianCalendar;

public class Calendar {
    public static void main(String[] args) {
        if (Integer.parseInt(args[0])<1 || Integer.parseInt(args[0])>12){
            System.out.println("Invalid input!");
        }
        String month = month(args);
        int year = Integer.parseInt(args[1]);
        System.out.println("           " + month + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        printMonthBody(month,year,Integer.parseInt(args[0]));
    }

    private static void printMonthBody(String month, int year,int mon) {
        int startOfMonth = getTheStartOfMonth(mon,year);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, mon);
        for (int i = 0; i < startOfMonth; i++) {
            System.out.print("    ");
        }
        for (int i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);
            if ((i + startOfMonth) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }

    private static int getTheStartOfMonth(int mon, int year) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        int totalNumberOfDays = getTotalNumberOfDays(year, mon);
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    private static int getTotalNumberOfDays(int year, int mon) {
        int total = 0;
        for (int i = 1800; i < year; i++)
            if (isLeapYear(i))
                total += 366;
            else
                total += 365;

        for (int i = 0; i < mon; i++)
            total += getNumberOfDaysInMonth(year, i);

        return total;
    }

    private static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2)
            return isLeapYear(year) ? 29 : 28;

        return 0;
    }

    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    private static String  month(String[] args) {
        String month;
        switch (Integer.parseInt(args[0])){
            case 1:month = "January"; break;
            case 2:month = "February"; break;
            case 3:month = "March"; break;
            case 4:month = "April"; break;
            case 5:month = "May"; break;
            case 6:month = "June"; break;
            case 7:month = "July"; break;
            case 8:month = "August"; break;
            case 9:month = "September"; break;
            case 10:month = "October"; break;
            case 11:month = "November"; break;
            default:month = "December";
        }
        return month;
    }
}
