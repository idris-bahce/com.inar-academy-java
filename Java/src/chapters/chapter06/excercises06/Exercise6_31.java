package chapters.chapter06.excercises06;

import java.util.Scanner;

public class Exercise6_31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your card number: ");
        long cardNum = in.nextLong();
        if (isValid(cardNum)){
            System.out.println(cardNum + " is valid.");
        }else {
            System.out.println(cardNum + " is not valid.");
        }
    }

    public static boolean isValid(long cardNum) {
        String num = "";
        num = num + cardNum;
        if (getSize(num) <13&& getSize(num) >16){
            return false;
        }int sum = sumOfOddPlace(num) + sumOfDoubleEvenPlace(num);
        if (sum % 10 == 0){
            return true;
        }else
            return false;
    }

    private static int getSize(String num) {
        return num.length();
    }
    public static int sumOfDoubleEvenPlace(String number){
        int sumOfDouble = 0;
        int sumOfDoubleEvenPlace = 0;
        for (int i = number.length()-2; i >= 0; i-=2) {
            char ch = number.charAt(i);
            sumOfDouble =(int)(ch - '0');
            if (sumOfDouble * 2 > 9){
                int doubledNum = sumOfDouble * 2;
                int digit1 = doubledNum / 10;
                int digit2 = doubledNum % 10;
                sumOfDoubleEvenPlace += digit2 + digit1;
            }
            sumOfDoubleEvenPlace += sumOfDouble * 2;
        }
        return sumOfDoubleEvenPlace;
    }
    public static int sumOfOddPlace(String number){
        int sumOfOdd = 0;
        for (int i = number.length() -1; i >= 0; i-=2) {
            char ch = number.charAt(i);
            sumOfOdd +=(int)(ch - '0');
        }
        return sumOfOdd;
    }
}
