package chapters.chapter05.chapter05checkpoints;

import java.util.Scanner;

public class CheckPoint5_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int number =0;
		do {
			sum += number;
			System.out.println("Enter an integer " + "(the input ends if it is 0)");
			number = input.nextInt();
		}while (number != 0);
	}
//in do-while we dont have to write exstra line. 
}
