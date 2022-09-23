package chapters.chapter05.chapter05excercises;

public class Excercise5_12 {

	public static void main(String[] args) {
		int n = 0;
		int minPow = 0;
		while(n<12_000) {
			if(n*n > 12_000) {
				System.out.println(n);
				break;
			}
			n++;
		}
	}

}
