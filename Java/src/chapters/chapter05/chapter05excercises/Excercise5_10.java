package chapters.chapter05.chapter05excercises;

public class Excercise5_10 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 100; i < 1001; i++) {
			for (int j = i; j < i + 1; j++) {
				if (i % 5 == 0 && i % 6 == 0) {
					System.out.print(i + " " );
					count++;
					if(count % 10 == 0)
						System.out.println();
				}
			}
		}

	}

}
