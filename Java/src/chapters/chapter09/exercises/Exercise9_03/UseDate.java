package chapters.chapter09.exercises.Exercise9_03;

import java.util.Date;

public class UseDate {
    public static void main(String[] args) {

        for (long i = 10_000; i <= 100000000000l; i*=10) {
            Date date = new Date(i);
            System.out.println(date.toString());
        }
    }
}
