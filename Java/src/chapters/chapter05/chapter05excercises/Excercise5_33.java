package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_33 {
	public static void main(String[] args) {

		for (int i = 1; i < 10000; i++) {
			boolean isPerfectNum = false;
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				isPerfectNum = true;
			}
			if (isPerfectNum) {
				System.out.println(sum);
			}

		}
	}
}
