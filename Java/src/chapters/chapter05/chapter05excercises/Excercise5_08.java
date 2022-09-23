package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of the students: ");
		int numOfStudents = in.nextInt();

		System.out.println("Enter the each name and the scores of the students.(i.e Ahmet 85):");
		String name = in.next();
		int score = in.nextInt();
		int count = 1;

		while (count < numOfStudents) {
			String n1 = in.next();
			int s1 = in.nextInt();
			count++;
			if (s1 > score) {
				score = s1;
				name = n1;
			}
		}
		System.out.print("The highest score is " + name + "'s score, it is " + score);
	}
}
