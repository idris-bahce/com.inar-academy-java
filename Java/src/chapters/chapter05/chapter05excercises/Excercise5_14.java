package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two intwegers:");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int d = Math.min(n1, n2);
		int ngcd = 1;
		while (d > 1) {
			if ((n1 % d == 0) && (n2 % d == 0)) {
				ngcd = d;
				break;
			}
			d--;
		}
		System.out.println("The greatest commen divisor is " + ngcd);

	}

}
