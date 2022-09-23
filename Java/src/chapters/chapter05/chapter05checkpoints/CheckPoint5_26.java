package chapters.chapter05.chapter05checkpoints;

public class CheckPoint5_26 {
	public static void main(String[] args) {
		a();
		b();
	}

	public static void a() {

		int sum = 0;
		int number = 0;

		while (number < 20) {
			number++;
			sum += number;
			if (sum >= 100) {
			}

		}

		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);

	}

	public static void b() {
		int sum = 0;
		int number = 0;
		while (number < 20) {
			number++;
			sum += number;
		}
		System.out.println("The sum is " + sum);

	}

}
