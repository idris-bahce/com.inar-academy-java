package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of the students:");
		int numOfStudents = in.nextInt();
		System.out.println("Enter each student and thei scores(i.e. James 45):");
		String name = in.next();
		int score = in.nextInt();
		int counter = 1;
		String str2="";
		int s2 = 0;
		
		
		while (counter < numOfStudents) {
			String str1 = in.next();
			int s1 = in.nextInt();
			counter++;
			
			if (s1 > score) {
				str2 = name;
				s2 = score;
				score = s1;
				str1 = name;
			}else if(s2<s1) {
				str2 = str1;
				s2 = s1;
			}
		}
		
		System.out.println("The highest score is " + name + "'s score, it is " + score);
		System.out.println("The second highest score is " + str2 + "'s score, it is " + s2);

	}
}
