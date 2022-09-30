package chapters.chapter06.excercises06;

import java.util.Scanner;

public class Excercise6_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integers you want to sum: ");
        long num = in.nextLong();
        System.out.println(sumDigits(num));
    }


    public static int sumDigits(long num) {//we can extract all integers and sum in this method
        long digit = 0;
        int sum = 0;
        while (num > 0) {
            digit = num % 10;
            num /= 10;
            sum += digit;
        }
        return sum;
    }
}
