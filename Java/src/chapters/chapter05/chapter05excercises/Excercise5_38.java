package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_38 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer to convert binary: ");
		int decimal = in.nextInt();
		int oct = 0;
		String soct = "";

		while (decimal > 0) {
			oct = decimal % 8;
			soct = oct + soct;
			decimal /= 8;
		}
		System.out.println(soct);
	}

}
