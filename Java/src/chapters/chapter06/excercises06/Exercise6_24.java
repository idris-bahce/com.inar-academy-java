package chapters.chapter06.excercises06;

import chapters.chapter06.listings06.PrintCalender;

public class Exercise6_24 {
    public static void main(String[] args) {

        System.out.print("Today's date is: ");
        getDate();
        System.out.print("The time is: ");
        getTime();
    }

    public static void getDate() {
        long totalSeconds = System.currentTimeMillis() / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHour = totalMinutes / 60;
        long currentDay = totalHour / 24 ;
        System.out.println(day(currentDay)+ "/" + month(currentDay) + "/" + year(currentDay));

    }

    public static int day(long days) {
        int daysUntilThisYear = 0;
                for (int i = 1970; i < year(days); i++) {
            if(isLeapYear(i)){
                daysUntilThisYear += 366;
            }else
                daysUntilThisYear += 365;
        }
        int daysInCurrentYear = (int)days - daysUntilThisYear;
        if(month(days).equals("January")) {
            return 31 - daysInCurrentYear;
        }else if (month(days).equals("February")) {
            if(isLeapYear(year(days)))
                return 31 + 29 - daysInCurrentYear;
            else
                return 31 + 28 - daysInCurrentYear;
        } else if (month(days).equals("March")) {
            return 28 + 31 + 31 -daysInCurrentYear;
        } else if (month(days).equals("April")) {
            return  31 + 28 + 31 + 30 - daysInCurrentYear;
        } else if (month(days).equals("May") ) {
            return 31 + 28 + 31 + 30 + 31 - daysInCurrentYear;
        } else if (month(days).equals("June")) {
            return  31 + 28 + 31 + 30 + 31 + 30 - daysInCurrentYear;
        } else if (month(days).equals("July")) {
            return  31 + 28 + 31 + 30 + 31 + 30 + 31 - daysInCurrentYear;
        } else if (month(days).equals("August")) {
            return  31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 - daysInCurrentYear;
        } else if (month(days).equals("September")) {
            return  31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 - daysInCurrentYear;
        } else if (month(days).equals("October")) {
            return  31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 - daysInCurrentYear;
        } else if (month(days).equals("November")) {
            return  31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 - daysInCurrentYear;
        }else
            return  31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 - daysInCurrentYear;
    }

    public static String month(long days) {
        int daysUntilThisYear = 0;
        int daysInCurrentYear = 0;
        for (int i = 1970; i < year(days); i++) {
            if(isLeapYear(i)){
                daysUntilThisYear += 366;
            }else
                daysUntilThisYear += 365;
        }
        daysInCurrentYear = (int)days - daysUntilThisYear;
        if(daysInCurrentYear <= 31) {
            return "January";
        }else if (((daysInCurrentYear<=28 + 31)&&!isLeapYear(year(days)))||((daysInCurrentYear<=29 + 31)&&isLeapYear(year(days)))) {
            return "February";
        } else if (daysInCurrentYear<= 28 + 31 + 31) {
            return "March";
        } else if (daysInCurrentYear <= 31 + 28 + 31 + 30) {
            return "April";
        } else if (daysInCurrentYear <= 31 + 28 + 31 + 30 + 31) {
            return "May";
        } else if (daysInCurrentYear <= 31 + 28 + 31 + 30 + 31 + 30) {
            return "June";
        } else if (daysInCurrentYear <= 31 + 28 + 31 + 30 + 31 + 30 + 31) {
            return "July";
        } else if (daysInCurrentYear <= 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31) {
            return "August";
        } else if (daysInCurrentYear <= 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30) {
            return "September";
        } else if (daysInCurrentYear <= 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31) {
            return "October";
        } else if (daysInCurrentYear <= 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30) {
            return "November";
        }else
            return "December";

    }

    public static int year(long days) {
        int year = 1970;
        while (days > 365){
            if (isLeapYear(year)){
                days -= 366;
            }else
                days -= 365;
            year++;
        }

        return year;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void getTime(){
        long totalSeconds = System.currentTimeMillis() / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHour = totalMinutes / 60;
        long currentHour = totalHour % 24;

        System.out.println(currentHour + 3 + " : " +currentMinutes + " : " + currentSeconds);
    }


}
