package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_11 {
    public static void main(String[] args) {
        int number = getTheNumber();
        String binaryNumber = getTheBinaryNumber(number);
        if(binaryNumber.length()<10){
            int length = binaryNumber.length();
            for (int i = 0; i < 9 - length; i++) {
                binaryNumber = 0 + binaryNumber;
            }
        }
        printTheMatrix(binaryNumber);
    }

    private static void printTheMatrix(String binaryNumber) {
        char[][] arr = new char[3][3];
        int stringIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (binaryNumber.charAt(stringIndex)=='0'){
                    arr[i][j] = 'H';
                    stringIndex++;
                }else {
                    arr[i][j] = 'T';
                    stringIndex++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static String getTheBinaryNumber(int number) {
        String binary = "";
        while (number>0){
            int remain = number % 2;
            number/=2;
            binary = remain + binary;
            if (number<=3){
                binary = (number%2) + binary;
                binary = (number/2) + binary;
                number=0;
            }
        }
        return binary;
    }

    private static int getTheNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number between 0-511: ");
        int number = in.nextInt();
        return number;
    }
}
