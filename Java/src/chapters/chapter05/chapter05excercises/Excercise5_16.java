package chapters.chapter05.chapter05excercises;

public class Excercise5_16 {
	public static void main(String[] args) {
		int i = 120;
		int factor = 2;
		int count = 0;
		int factors = 0;
		while (count <= 120) {
			if (i % factor == 0) {
				factors = i / factor;
				System.out.println(factor);
			}
			i = factors;
			if (i % factor == 0) {

			} else {
				factor++;
			}
			count++;
		}
	}

}
