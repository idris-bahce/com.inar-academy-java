package chapters.chapter05.chapter05excercises;

public class Excercise5_04 {
	public static void main(String[] args) {

		int kilometers = 0;
		double miles = 0;
		
		System.out.println("Kilometers \t Miles" );
		System.out.println("---------- \t -----");
		
		while(kilometers<11) {
			miles = kilometers * 1.609;
			System.out.printf(kilometers + " \t\t  %.3f", miles );
			System.out.println();
			kilometers++;
		}
	
	}

}
