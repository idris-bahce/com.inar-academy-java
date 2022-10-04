package chapters.chapter06.excercises06;

import java.util.Scanner;

public class Exercise6_37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = in.next();
        System.out.println("Enter the width you want for the string:");
        int width = in.nextInt();

        if(str.length()>=width){
            System.out.println(str);
        }else
            System.out.println(format(str.length(), width)+str);
    }

    public static String format(int length, int width) {
        int numberOfZeros = width - length;
        String result = "";
        for (int i = 0; i < numberOfZeros; i++) {
            result = result + 0;
        }
        return result;
    }
}
