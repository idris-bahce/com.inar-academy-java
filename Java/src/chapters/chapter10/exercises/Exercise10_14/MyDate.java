package chapters.chapter10.exercises.Exercise10_14;

import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        this(System.currentTimeMillis());
    }

    public MyDate(long elapsedTime){
        this(calendar(elapsedTime).get(GregorianCalendar.YEAR),calendar(elapsedTime).get(GregorianCalendar.MONTH),
                calendar(elapsedTime).get(GregorianCalendar.DAY_OF_MONTH));
    }
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public static GregorianCalendar calendar(long elapsedTime){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        return calendar;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    public void setDate(long elapsedTime){
        this.year = calendar(elapsedTime).get(GregorianCalendar.YEAR);
        this.month = calendar(elapsedTime).get(GregorianCalendar.MONTH);
        this.day = calendar(elapsedTime).get(GregorianCalendar.DAY_OF_MONTH);
    }
}
