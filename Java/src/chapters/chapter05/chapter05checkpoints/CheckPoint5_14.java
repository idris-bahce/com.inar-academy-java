package chapters.chapter05.chapter05checkpoints;

import java.util.concurrent.CountDownLatch;

public class CheckPoint5_14 {
	public static void main(String[] args) {
		a();
		b();
		c();
		d();

	}

	public static void a() {

		int count = 0;
		while (count < 10) {
			count++;
		}
		System.out.println(count);
		// n times iterates

	}

	public static void b() {
		int count = 0;
		for (count = 0; count <= 10; count++) {
		} // n + 1 times iterates.
		System.out.println(count);

	}

	public static void c() {
		int count = 5;
		int counter = 0;
		while (count < 10) {
			count++;
			counter++;
		}
		System.out.println(counter);
		// n - 5 times iterates.
	}

	public static void d() {
		int count = 5;
		int counter = 0;
		while (count < 30) {
			count = count + 3;
			counter++;
		}
		System.out.println(counter);
		//(n-5)/3 times but if there is a remain in this equation we just round it to upper integer.
	}
}
