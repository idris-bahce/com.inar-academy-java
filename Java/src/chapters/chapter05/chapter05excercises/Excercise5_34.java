package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_34 {
	public static void main(String[] args) {
		int compWins = 0;
		int playerWins = 0;
		int endGame = 0;
		while (endGame < 1) {

			int computer = (int) (Math.random() * 3);
			Scanner in = new Scanner(System.in);
			System.out.println("Enter scissor (0), rock (1), paper (2): ");
			int player = in.nextInt();
			if ((computer == 0 && player == 0)) {
				System.out.println("The computer is scissor. you are scissor.no one wins.");
			} else if (computer == 1 && player == 1) {
				System.out.println("The computer is rock. You are rock. No one wins");
			} else if (computer == 2 && player == 2) {
				System.out.println("The computer is paper. You are paper. no one wins.");
			} else if (computer == 0 && player == 1) {
				System.out.println("The computer is scissor.You are rock. You win!");
				playerWins++;
			} else if (computer == 0 && player == 2) {
				System.out.println("The computer is scissor. You are paper. You are defeated!");
				compWins++;
			} else if (computer == 1 && player == 0) {
				System.out.println("The computer is rock. You are scissor. You are defeated!");
				compWins++;
			} else if (computer == 1 && player == 2) {
				System.out.println("The computer is rock. You are paper. You win!");
				playerWins++;
			} else if (computer == 2 && player == 0) {
				System.out.println("The computer is paper. You are scissor. You win!");
				playerWins++;
			} else if (computer == 2 && player == 1) {
				System.out.println("The computer is paper. You are rock. You are defeated!");
				compWins++;
			} else {
				System.out.println("Computer wins, you input an invalid value so you forfiet this round!");
				compWins++;
			}

			if (Math.abs(playerWins - compWins) == 2) {
				endGame = 1;
			}
		}
	}
}
