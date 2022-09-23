package chapters.chapter05.chapter05excercises;

public class Excercise5_25 {
	public static void main(String[] args) {
		a();
		b();
		c();
	}

	public static void a() {
		double j = 0;
		for (int i = 1; i < 10000; i++) {
			j += (Math.pow(-1, i + 1)) / (2 * i - 1);
		}
		double pi = 4 * j;
		System.out.println(pi);
	}

	public static void b() {
		double j = 0;
		for (int i = 1; i <= 20000; i++) {
			j += (Math.pow(-1, i + 1)) / (2 * i - 1);
		}
		double pi = 4 * j;
		System.out.println(pi);
	}

	public static void c() {
		double j = 0;
		for (int i = 1; i <= 100000; i++) {
			j += (Math.pow(-1, i + 1)) / (2 * i - 1);
		}
		double pi = 4 * j;
		System.out.println(pi);
	}
}
