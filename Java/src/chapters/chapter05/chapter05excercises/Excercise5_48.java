package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_48 {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String str = in.nextLine();
	        str=str.trim();
	        int letters = str.length();
	        String oddStr = "";
	        for (int i = 0; i < letters; i++) {
				char ch = str.charAt((int)(Math.random() * letters));
				oddStr = oddStr + ch;
			}
	        System.out.println(oddStr);
	      
	    }
}
