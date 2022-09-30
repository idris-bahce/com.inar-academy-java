package chapters.chapter06.excercises06;

import java.util.Scanner;

public class Excercise6_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three integer to align them increasingly:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        displaySortedNumbers(num1, num2, num3);
    }

    private static void displaySortedNumbers(int num1, int num2, int num3) {
        if (num1<num2 && num1<num3){
            if(num2<num3){
                System.out.println("Increasingly alignment is: " + num1 + ", " + num2 + ", " + num3);
            }else {
                System.out.println("Increasingly alignment is: " + num1 + ", " + num3 + ", " + num2);
            }
        }else if (num2<num1 && num2<num3){
            if(num1<num3){
                System.out.println("Increasingly alignment is: " + num2 + ", " + num1 + ", " + num3);
            }else {
                System.out.println("Increasingly alignment is: " + num2 + ", " + num3 + ", " + num1);
            }
        } else if (num3<num1 && num3<num2){
            if(num2<num1){
                System.out.println("Increasingly alignment is: " + num3 + ", " + num2 + ", " + num1);
            }else {
                System.out.println("Increasingly alignment is: " + num3 + ", " + num1 + ", " + num2);
            }
        }
    }
}
