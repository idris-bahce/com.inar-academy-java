package chapters.chapter05.chapter05checkpoints;

public class CheckPoint5_25 {
	public static void main(String[] args) {

		int i = 0;
		int sum = 0;

		while (i < 4) {
			if (i % 3 == 0) {
				i++;
				continue;
			}
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}