package chapters.chapter05.chapter05excercises;

public class Excercise5_15 {
	public static void main(String[] args) {
		int counter = 0;
		for (int i = 33; i < 127; i++) {
			for (int j = i; j < i+1; j++) {
				char ch = (char)i;
				System.out.print(ch + " ");
				counter++;
				if(counter % 10 == 0) {
					System.out.println();
				}
			}
		}
	}

}
