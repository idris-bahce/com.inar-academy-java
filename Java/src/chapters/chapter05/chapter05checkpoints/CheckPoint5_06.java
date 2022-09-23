package chapters.chapter05.chapter05checkpoints;

import java.util.Scanner;

public class CheckPoint5_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number, max;
		number = input.nextInt();
		max = number;
		do {
			number = input.nextInt();
			if (number > max)
				max = number;
		} while (number != 0);
		System.out.println("max is " + max);
		System.out.println("number " + number);
	}
//output: max: 5, number:0
}
