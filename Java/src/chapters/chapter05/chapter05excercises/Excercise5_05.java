package chapters.chapter05.chapter05excercises;

public class Excercise5_05 {
	public static void main(String[] args) {
		double kilogram = 1;
		double pound = 0;
		double pound2 = 20;
		double kg = 0;
		
		String str ="|";
		
		System.out.println("Kilograms \t Pounds \t| \t Pounds \t Kilograms");
		System.out.println("--------- \t ------ \t  \t ------ \t ---------");
		
		while(kilogram<200) {
			pound = kilogram * 2.2;
			System.out.printf("%5.0f %15.2f", kilogram, pound);
			while (pound2 < 515) {
				kg = pound2 / 2.2;
				System.out.printf(" %11s %12.0f %15.2f ", str, pound2, kg);
				break;
			}
			System.out.println();
			kilogram++;
			pound2++;
		}
	}

}
