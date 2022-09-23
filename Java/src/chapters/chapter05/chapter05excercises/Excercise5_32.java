package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_32 {
	public static void main(String[] args) {
		int lotaryDigid1 = (int) (Math.random() * 10);
		int lotaryDigid2 = 0;
		for (int i = 0; i < 100; i++) {
			lotaryDigid2 = (int) (Math.random() * 10);
			if (lotaryDigid2 != lotaryDigid1)
				break;
		}
		if(lotaryDigid1<lotaryDigid2) {
			int temp = lotaryDigid1;
			lotaryDigid1 = lotaryDigid2;
			lotaryDigid2 = temp;
		}
		int lotary = 10 * lotaryDigid1 + lotaryDigid2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a two digid number: ");
		int guess = input.nextInt();
		System.out.println(lotary);

		int guessDigid1 = guess / 10;
		int guessDigid2 = guess % 10;

		if (guess == lotary) {
			System.out.println("Congralations. You win $10000!");
		} else if (lotaryDigid1 == guessDigid1 && lotaryDigid1 == guessDigid2) {
			System.out.println("Congralations. You win $3000!");
		} else if (lotaryDigid1 == guessDigid1 || lotaryDigid1 == guessDigid2 || lotaryDigid2 == guessDigid1
				|| lotaryDigid2 == guessDigid2) {
			System.out.println("Congralations. you win $1000!");
		} else
			System.out.println("Sorry. try again...");
	}
}
