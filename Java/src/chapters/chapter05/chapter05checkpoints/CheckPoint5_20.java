package chapters.chapter05.chapter05checkpoints;

public class CheckPoint5_20 {
	public static void main(String[] args) {
		a();
		b();
		c();
		d();
	}

	public static void a() {
		for (int i = 1; i < 5; i++) {
			int j = 0;
			while (j < i) {
				System.out.print(j + " ");
				j++;
			}
		}
	}

	public static void b() {
		int i = 0;
		while (i < 5) {
			for (int j = i; j > 1; j--)
				System.out.print(j + " ");
			System.out.println("****");
			i++;
		}
	}

	public static void c() {
		int i = 5;
		while (i >= 1) {
			int num = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + "xxx");
				num *= 2;
			}
			System.out.println();
			i--;
		}
	}

	public static void d() {
		int i = 1;
		do {
			int num = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + "G");
				num += 2;
			}
			System.out.println();
			i++;
		} while (i <= 5);
	}
}
