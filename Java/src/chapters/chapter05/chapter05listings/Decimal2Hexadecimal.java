package chapters.chapter05.chapter05listings;

import java.util.Scanner;

public class Decimal2Hexadecimal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int decNum = in.nextInt();
		String hexNum = "";
		
		int remain = decNum;
		while(remain > 0) {
			int digit = remain % 16; 
			if (digit<10) {
				hexNum = digit + hexNum;
			}else {
				hexNum = (char)('A' + (digit - 10)) + hexNum;
			}
			remain /= 16;
			
		}
		System.out.println(decNum + " is " + hexNum + " as hexadecimal.");
	}
}
