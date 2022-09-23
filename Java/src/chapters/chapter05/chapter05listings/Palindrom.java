package chapters.chapter05.chapter05listings;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String str1 = in.nextLine();
		String str = str1.trim().toLowerCase();
		int length = str.length();
		int j = length - 1;
		boolean isPalindrome = true;
		int i = 0;

		while ( i < j) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(j);
			i++;
			j--;
			if(ch1 != ch2) {
				isPalindrome = false;
				break;
			}
			
		}
		if (isPalindrome) {
			System.out.println(str +" is a palindrom.");
		}else {
			System.out.println(str +" is not a palindrom.");
		}
	
	}

}
