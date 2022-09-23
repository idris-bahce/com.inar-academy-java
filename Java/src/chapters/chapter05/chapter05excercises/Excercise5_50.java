package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_50 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = in.nextLine();
		str = str.trim();
		int letter = str.length();
		int counter = 0;
		for (int i = 0; i < letter; i++) {
			char ch = str.charAt(i);
			if ('A' <= ch && ch <= 'Z') {
				counter++;
			}
		}
		System.out.println("The number of uppercase letters is: " + counter);
	}

}
