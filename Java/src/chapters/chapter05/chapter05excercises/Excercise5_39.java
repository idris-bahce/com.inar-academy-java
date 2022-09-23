package chapters.chapter05.chapter05excercises;

public class Excercise5_39 {
	public static void main(String[] args) {
		double sum = 30000;
		for (int amount = 1; amount < 2000000; amount++) {
			if (sum < 5000 * 0.08 + 5000 * 0.1 + amount * 0.12) {
				System.out.println("The amount salesmen has to sell for 30K is: " + (amount + 10000));
				break;
			}
		}
	}
	
}
