package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_46 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = in.next();
		word = word.toUpperCase().trim();
		int wordLetters = word.length();
		String reversed = "";
		for (int i = 0; i < wordLetters; i++) {
			char ch = word.charAt(i);
			reversed = ch + reversed; 
		}
		System.out.println(reversed);
	}
}
