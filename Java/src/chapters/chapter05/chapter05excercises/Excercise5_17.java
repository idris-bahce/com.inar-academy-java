package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the line between 1 - 15: ");
		int i = in.nextInt();
		int k = i - (i - 1);
		int l = 2;
		while (i > 0) {

			for (int j = i; j > 0; j--) {
				System.out.print("  ");
			}
			for (int j = k; j > 0; j--) {
				System.out.print(j + " ");
			}
			for (int j2 = 2; j2 <= k; j2++) {
				System.out.print(j2 + " ");

			}

			System.out.println();
			i--;
			l++;
			k++;
		}
	}
}
