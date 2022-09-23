package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer, the input ends if it is 0: ");
		int i = in.nextInt();
		int positiveCount = 0;
		int negativeCount = 0;
		double total = 0;

		if (i != 0) {
			while (i != 0) {

				if (i > 0) {
					positiveCount++;
				} else {
					negativeCount++;
				}
				total = total + i;
				i = in.nextInt();
			}

			double average = total / (positiveCount + negativeCount);
			System.out.println("The number of positives is " + positiveCount);
			System.out.println("The number of negatives is " + negativeCount);
			System.out.println("The total " + total);
			System.out.println("The avarage is " + average);
		} else {
			System.out.println("No numbers are entered except 0");
		}
	}

}
