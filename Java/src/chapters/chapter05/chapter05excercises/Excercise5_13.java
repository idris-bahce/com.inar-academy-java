package chapters.chapter05.chapter05excercises;

public class Excercise5_13 {
	public static void main(String[] args) {
		int n = 0;
		int maxn=0;
		while (n * n * n < 12_000 ) {
			maxn = n;
			n++;
		}
		System.out.println(maxn);
	}
}
