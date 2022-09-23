package chapters.chapter05.chapter05excercises;

public class Excercise5_24 {
	public static void main(String[] args) {
		double num = 0;
		for (int i = 3; i < 100; i+=2) {
			num = (i-2)/i;
		}
		System.out.println("The sum of the series is: " + num );	}
}
