package chapters.chapter05.chapter05listings;

public class FutureTution {
	public static void main(String[] args) {
		double tution = 10_000;
		int year = 0;
		
		while(tution <= 20_000) {
			tution*=1.07;
			year++;
		}
		System.out.printf("In " + year + " years your tution will be: %.2f", tution);
	}

}
