package chapters.chapter12.listings;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        try {
            int result = quotient(number1,number2);
            System.out.println(number1 + " / " + number2 + " is " + result);
        }catch (ArithmeticException a){
            System.out.println("Exception: an integer cannot be divided by zero ");
        }
        System.out.println("Execution continues ...");
    }

    private static int quotient(int number1,int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
             }
        return (number1 / number2);
    }
}
