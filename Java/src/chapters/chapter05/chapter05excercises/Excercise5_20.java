package chapters.chapter05.chapter05excercises;

import java.util.Iterator;

public class Excercise5_20 {
	public static void main(String[] args) {
		int primeNum = 2;
		int i = 0;
		int counter = 0;
		while (i < 1000) {
			boolean isPrimeNum = true;
			for (int j = 2; j < primeNum; j++) {
				if (primeNum % j == 0) {
					isPrimeNum = false;
					break;
				}
			}
			if (isPrimeNum) {
				System.out.printf("%4d",primeNum);
				counter++;
				if (counter % 10 == 0) {
					System.out.println();
				}
			}
			i++;
			primeNum++;
		}
	}
}
