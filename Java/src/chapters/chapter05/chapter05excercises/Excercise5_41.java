package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_41 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numbers:(enter 0 to terminate the numbers)");
		int num = in.nextInt();
		int max = num;
		int count = 1;
		while (num != 0) {
			int i = 0;
			num = in.nextInt();
			i = num;
			if (max < i) {
				max = num;
				continue;
			}
			if(max == num) {
				count++;
			}
		}
		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is " + count);
		
		
	}
}
