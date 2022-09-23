package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_51 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str1 = in.nextLine();
		System.out.println("Enter the second string: ");
		String str2 = in.nextLine();
		str1 = str1.trim();
		str2 = str2.trim();

		int letter1 = str1.length();
		int letter2 = str2.length();
		if (letter1 > letter2 ) {
			int temp = letter1;
			letter1 = letter2;
			letter2 = temp;
		}
		int counter = 0;
		String prefix = "";

		for (int i = 0; i < letter1; i++) {
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);
			if (ch1 == ch2) {
				counter++;
				prefix = prefix + ch1;
			}else
				break;
		}
		if (counter > 0) {
			System.out.println("The common prefix is " + prefix);
		} else {
			System.out.println(str1 + " and " + str2 + " have no common prefix.");
		}
	}
}
