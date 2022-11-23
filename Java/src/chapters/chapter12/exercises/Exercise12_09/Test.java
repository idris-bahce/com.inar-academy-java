package chapters.chapter12.exercises.Exercise12_09;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String binary = in.next();
        controlBinary(binary);
        convertBinaryToDecimal(binary);
    }

    private static void convertBinaryToDecimal(String binary) {
        int sum = 0;
        for (int i = binary.length() - 1,k = 0; i >= 0;k++, i--) {
            sum += Math.pow(2,k) * (Integer.parseInt(binary.charAt(i) + ""));
        }
        System.out.println("Decimal number is " + sum);
    }

    private static void controlBinary(String binary) {
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i)!= '0' && binary.charAt(i) != '1'){
                throw new BinaryFormatException("Invalid input!");
            }
        }
    }
}
