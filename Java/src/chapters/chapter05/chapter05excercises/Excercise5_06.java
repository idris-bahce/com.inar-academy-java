package chapters.chapter05.chapter05excercises;

public class Excercise5_06 {

	public static void main(String[] args) {
		double km1 = 1;
		double mile1 = 1;
		double km2 = 20;
		double mile2 = 1;

		String str = "|";

		System.out.println("Miles \t Kilometers \t| \tKilometers \t Miles");
		System.out.println("----- \t ---------- \t\t---------- \t -----");
		
		while(mile1<11) {
			km1 = mile1 * 1.609;
			System.out.printf("%2.0f %14.3f", mile1, km1);
			while(km2<66) {
				mile2 = km2 / 1.609;
				System.out.printf("%8s %10.0f %18.3f",str, km2, mile2);
				km2+=5;
				break;
			}
			System.out.println();
			mile1++;
		}
	}
}
