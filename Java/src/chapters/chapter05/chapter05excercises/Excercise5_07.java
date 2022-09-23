package chapters.chapter05.chapter05excercises;

public class Excercise5_07 {
	public static void main(String[] args) {
		double tution = 10_000;
		double interestRate = 0.05;
		int year = 0;
		
		while(year < 10) {
			tution =tution * interestRate + tution;
			year++;
		}
		System.out.println("Tution will be $" + ((int)(tution *100) /100.0) + " after " + year + " years.");
		
		int fourYear=0;
		double fourYearAmount = tution;
		while(fourYear<4) {
			tution =tution * interestRate + tution;
			fourYearAmount +=tution;
			fourYear++;
		}
		System.out.printf("With this amount in four years your total cost will be $%.2f", fourYearAmount);
	}
}
