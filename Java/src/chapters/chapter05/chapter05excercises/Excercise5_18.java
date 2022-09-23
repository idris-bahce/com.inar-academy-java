package chapters.chapter05.chapter05excercises;

public class Excercise5_18 {
	public static void main(String[] args) {
		a();
		System.out.println();
		b();
		System.out.println();
		c();
		System.out.println();
		d();
	}

	public static void a() {
		System.out.println("PATERN A");
		for (int i = 0; i < 7; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	public static void b() {
		System.out.println("PATERN B");
		int k = 7;
		for (int i = 0; i < 7; i++) {
			for (int j = 1; j < k; j++) {
				System.out.print(j + " ");
			}
			k--;
			System.out.println();
		}

	}

	public static void c() {
		System.out.println("PATERN C");
		int k = 1;
		int l = 0;
		for (int i = 0; i < 7; i++) {
			for (int s = 6; s > i ; s--) {
				System.out.print("  ");
			}
			for (int j = k; j > i - l; j--) {
				System.out.print(j + " ");
			}
			
			System.out.println();
			k++;
			l++;
		}

	}

	public static void d() {
		System.out.println("PATERN D");
		for (int i = 1; i < 7; i++) {
			for (int s = 0; s < i; s++) {
				System.out.print("  ");
			}
			for (int a = 1; a <= 7 - i; a++) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}
}
