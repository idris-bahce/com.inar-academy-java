package chapters.chapter05.chapter05checkpoints;

public class CheckPoint5_17 {
	public static void main(String[] args) {

		int j = 0;
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;

			if (i < j) {
				System.out.println(i);
			} else {
				System.out.println(j);
			}
		}
		while (j < 10)
			;
		{
			j++;
		}
		do {
			j++;
		} while (j < 10);
	}
}
