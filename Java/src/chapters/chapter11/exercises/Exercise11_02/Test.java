package chapters.chapter11.exercises.Exercise11_02;

import chapters.chapter10.exercises.Exercise10_14.MyDate;

public class Test {
    public static void main(String[] args) {
        printEmployees(new Student("idris","bolvadin","ib@hmail.com","2465875",3));

        printEmployees(new Faculty("ahmet","afyon","ahmail.com","32546887454",new MyDate(),false,
                15500,"08.00-16.00","Junior"));
        printEmployees(new Staff("ahmet","afyon","ahmail.com","32546887454",new MyDate(),false,
                5500,"cleaner"));
    }

    private static void printEmployees(Person e) {
        System.out.println(e.toString());
        System.out.println("-----------------------------");
    }
}
