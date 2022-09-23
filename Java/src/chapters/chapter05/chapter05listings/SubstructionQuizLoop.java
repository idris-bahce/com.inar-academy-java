package chapters.chapter05.chapter05listings;

import java.util.Scanner;

public class SubstructionQuizLoop {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long startTime = System.currentTimeMillis() / 1000;

		int count = 0;
		int correctCount = 0;
		String output = "";
		while (count < 3) {
			count++;
			int num1 = (int) (Math.random() * 10);
			int num2 = (int) (Math.random() * 10);

			if (num2 > num1) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			System.out.println(num1 + " - " + num2 + " = ?");
			int answer = in.nextInt();
			output = num1 + " - " + num2 + " = " + answer;
			if (answer == num1 - num2) {
				System.out.println("True!");
				correctCount++;
				output += "True!\n";
			} else {
				System.out.println("False!");
				output += "False!\n";
			}
		}
		System.out.println("You made " + correctCount + " of them true!");
		System.out.println(output);
		long endTime = System.currentTimeMillis() / 1000;
		int time = (int)(endTime - startTime);
		System.out.println("You made it in " + time + " seconds.");
	}

}
