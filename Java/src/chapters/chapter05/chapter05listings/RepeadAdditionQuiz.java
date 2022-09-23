package chapters.chapter05.chapter05listings;

import java.util.Scanner;

public class RepeadAdditionQuiz {
	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		Scanner in = new Scanner(System.in);
		System.out.println("What is the result of this equation: "+num1+ " + " + num2);
		int answer = in.nextInt();

		int repeat = 0;
		while(answer!=num1+num2 && repeat<2) {
			repeat++;
			System.out.println("Wrong! Try again...");
			System.out.println("What is the result of this equation: "+num1+ " + " + num2);
			answer=in.nextInt();
		}
		if(answer == num1 + num2) {
		System.out.println("True!");
		}else {
			System.out.println("Enough! Dont play with me anymore!!");
		}
	}

}
