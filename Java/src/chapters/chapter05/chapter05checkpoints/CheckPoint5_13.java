package chapters.chapter05.chapter05checkpoints;

public class CheckPoint5_13 {
	public static void main(String[] args) {
		long sum = 0;
		int i = 0;
		while (i <= 1000) {
			sum = sum + i;
			i++;
		}
		long sumb = 0;
		int ib = 0;
		do  {
			sumb = sumb + ib;
			ib++;
		} while (ib <= 1000);
		
		System.out.println(sum);
		System.out.println(sumb);
	}
}
