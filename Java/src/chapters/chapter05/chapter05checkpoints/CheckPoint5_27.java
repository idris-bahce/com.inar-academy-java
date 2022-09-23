package chapters.chapter05.chapter05checkpoints;

public class CheckPoint5_27 {
	public static void main(String[] args) {
		a();
		System.out.println("-----");
		b();
	}

	public static void a() {
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				if (i * j > 2)
					break; //after break system leaps to line 17.
				System.out.println(i * j);
			}
			System.out.println(i);
		}
	}

	public static void b() {
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				if (i * j > 2)
					continue;//after continue system leaps to line 23.
				System.out.println(i * j);
			}
			System.out.println(i);
		}

	}
}
