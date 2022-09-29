package chapters.chapter06.listings06;

import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number: ");
        String hex = in.next();
        hex = hex.toUpperCase();
        System.out.println(hex + " is " + hextodec(hex));
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
