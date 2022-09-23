package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_49 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = in.nextLine();
		str = str.toLowerCase().trim();
		int letter = str.length();
		int counterVowel = 0;
		int counterConsenent = 0;
		for (int i = 0; i < letter; i++) {
			char ch = str.charAt(i);
			if ('a' <= ch && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					counterVowel++;
				} else {
					counterConsenent++;
				}
			}
		}
		System.out.println("The number of vowels is: " + counterVowel);
		System.out.println("The number of consanent is: " + counterConsenent);
	}
}
