package chapters.chapter05.chapter05checkpoints;

public class CheckPoint5_24 {
	public static void main(String[] args) {
		a();
		b();
	}

	public static void a() {
		int balance = 10;
		while (true) {
			if (balance < 9)
				break;
			balance = balance - 9;
		}
		System.out.println("Balance is " + balance);
	}

	public static void b() {
		int balance = 10;
		while (true) {
			if (balance < 9)
				continue;
			balance = balance - 9;
		}
		//System.out.println("Balance is " + balance); this is a infinitive loop.
	}

}
