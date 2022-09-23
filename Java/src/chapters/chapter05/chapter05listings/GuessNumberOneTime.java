package chapters.chapter05.chapter05listings;

import java.util.Scanner;

public class GuessNumberOneTime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = (int) (Math.random() * 101);
		System.out.println("Guess our number which is between 0 and 100 inclusively:");
		int guess = in.nextInt();

		while (guess != num) {
			if (guess > num) {
				System.out.println("You entered bigger number. Try again.");
			} else {
				System.out.println("You entered smaller number. Try again.");
			}
			guess = in.nextInt();
		}
		System.out.println("You got it. True!");
	}

}
