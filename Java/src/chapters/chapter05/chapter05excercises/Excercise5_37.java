package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_37 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer to convert binary: ");
		int decimal = in.nextInt();
		int binary = 0;
		String sbinary = "";

		while (decimal > 0) {
			binary = decimal % 2;
			sbinary = binary + sbinary;
			decimal /= 2;
		}
		System.out.println(sbinary);
	}
}
