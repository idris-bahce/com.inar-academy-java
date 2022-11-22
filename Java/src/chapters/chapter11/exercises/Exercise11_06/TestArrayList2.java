package chapters.chapter11.exercises.Exercise11_06;

import chapters.chapter10.listings.Loan;
import chapters.chapter11.listings.CircleWithCustomException;

import java.util.ArrayList;
import java.util.Date;

public class TestArrayList2 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Loan());
        list.add(new Date());
        list.add("Hello");
        list.add(new CircleWithCustomException(5));


        for (Object o : list) {
            System.out.println(o);
            System.out.println("-------");
        }
    }
}
