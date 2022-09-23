package chapters.chapter05.chapter05excercises;

public class Excercise5_27 {
	public static void main(String[] args) {
		int counter = 0;
		for (int year = 101; year < 2100; year++) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.printf("%5d",year);
				counter++;

				if (counter % 10 == 0)
					System.out.println();
			}
		}
	}
}
