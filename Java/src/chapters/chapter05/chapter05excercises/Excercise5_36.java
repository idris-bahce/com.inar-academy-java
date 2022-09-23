package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_36 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		int d1 = in.nextInt();
		int d2 = in.nextInt();
		int d3 = in.nextInt();
		int d4 = in.nextInt();
		int d5 = in.nextInt();
		int d6 = in.nextInt();
		int d7 = in.nextInt();
		int d8 = in.nextInt();
		int d9 = in.nextInt();

		int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		if (d10 == 10) {
			System.out.println("X");
		} else {
			System.out.println(d10);
		}
	}

}
