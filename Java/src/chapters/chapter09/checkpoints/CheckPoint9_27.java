package chapters.chapter09.checkpoints;

import java.util.Date;

public class CheckPoint9_27 {
    public static void main(String[] args) {
        Date[] dates = new Date[10];
        //dates[0] = new Date(); if we put this line, there would be no problem.
        System.out.println(dates[0]);
        System.out.println(dates[0].toString());// we didn't fill the elements. That is why we take null pointer exception.

    }
}
