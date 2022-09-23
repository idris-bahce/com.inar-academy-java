package chapters.chapter05.chapter05excercises;

public class Excercise5_11 {

	public static void main(String[] args) {
		int counter = 0;
		for (int i = 100; i < 201; i++) {
			for (int j = i; j < i+1; j++) {
				if(i % 5 == 0 ^ i % 6 == 0) {
					System.out.print(j + " ");
					counter++;
					if(counter % 10 == 0) {
						System.out.println();
					}
				}
			}
		}
	}

}
