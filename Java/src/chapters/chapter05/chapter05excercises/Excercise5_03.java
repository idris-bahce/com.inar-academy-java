package chapters.chapter05.chapter05excercises;

public class Excercise5_03 {
	public static void main(String[] args) {
		int kilogram = 0;
		double pound = 0;
		
		System.out.println("Kilogram \t Pound" );
		System.out.println("-------- \t -----");
		
		while(kilogram<200) {
			pound = kilogram * 2.2;
			System.out.printf(kilogram + " \t\t %.2f", pound);
			System.out.println();
			kilogram++;
		}
	}

}
