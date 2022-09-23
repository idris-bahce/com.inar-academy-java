package chapters.chapter05.chapter05checkpoints;

import java.util.Scanner;

public class CheckPoint5_23 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int decNum = in.nextInt();
		String hexNum = "";
		int count = 0;
		int remain = decNum;
		while(remain > 0) {
			int digit = remain % 16; 
			if (digit<10) {
				hexNum = digit + hexNum;
			}else {
				hexNum = (char)('A' + (digit - 10)) + hexNum;
			}
			remain /= 16;
			count++;
		}
		System.out.println(decNum + " is " + hexNum + " as hexadecimal.");
		System.out.println(count);
	}// 2 times for 245 and 3 times for 3245


}
