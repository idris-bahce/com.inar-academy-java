package chapters.chapter12.exercises.Exercise12_08;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex = in.next();
        hex = hex.toUpperCase();
        controlInput(hex);
        System.out.println(hex + " is " + hextodec(hex));
    }

    private static void controlInput(String hex) {
        for (int i = 0; i < hex.length(); i++) {
            if (!(('0'<= hex.charAt(i)&&hex.charAt(i)<='9')||('A'<=hex.charAt(i)&&hex.charAt(i)<='F'))){
                throw new HexFormatException("Invalid input!");
            }
        }
    }

    public static int hextodec(String s) {
        int digit = 0;
        int decimal = 0;
        int len = s.length();
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if ('A'<=ch && ch<='F'){
                digit = (ch -'A') + 10;
            } else if ('0' <= ch && ch <= '9') {
                digit = (ch - '0');
            }
            double sum = digit * Math.pow(16,len-1);
            decimal+=sum;
            len--;
        }
        return decimal;
    }
}
