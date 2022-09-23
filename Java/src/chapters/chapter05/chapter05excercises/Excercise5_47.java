package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_47 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first 12 digits of an ISBN-13: ");
		String isbn = in.next();
		if (isbn.length() != 12) {
			System.out.println(isbn + " is an invalid input");
			System.out.println("Enter the first 12 digits of an ISBN-13: ");
			isbn = in.next();
		}
		int letters = isbn.length();
		int sum = 0;
		int isbn13 = 0;
		int numIsbn = 0;
		for (int i = 0; i < letters; i++) {
			char ch = isbn.charAt(i);

			if (i % 2 == 1) {
				numIsbn = 3 * Character.getNumericValue(ch);
			} else {
				numIsbn = Character.getNumericValue(ch);
			}
			sum += numIsbn;
		}
		isbn13 = 10 - sum % 10;
		if (isbn13 == 10) {
			isbn13 = 0;
		}

		System.out.println("The ISBN-13 number is " + isbn + isbn13);

	}
}
