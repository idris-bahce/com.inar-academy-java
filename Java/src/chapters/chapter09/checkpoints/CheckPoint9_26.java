package chapters.chapter09.checkpoints;

import java.util.Date;

public class CheckPoint9_26 {
    public static void main(String[] args) {
        Date date = new Date(1234567);
        m1(date);
        System.out.println(date.getTime());
    }
    public static void m1(Date date) {
        date = null;
    }
}
