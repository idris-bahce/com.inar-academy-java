package chapters.chapter05.chapter05checkpoints;

public class CheckPoint5_18 {

	public static void main(String[] args) {
		a();
		b();
	}

	public static void a() {
		int i = 0;
		do {
			System.out.println(i + 4);
			i++;
		} while (i < 10);
	}

	public static void b() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 4);
		}
	}
}
