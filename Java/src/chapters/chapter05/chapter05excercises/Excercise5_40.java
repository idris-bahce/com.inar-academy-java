package chapters.chapter05.chapter05excercises;

import java.util.Iterator;

public class Excercise5_40 {
	public static void main(String[] args) {
		int counter = 0;
		for (int i = 0; i < 1000000; i++) {
			counter++;
			int num = (int) (Math.random() * 2);
			if(num == 1) {
				System.out.println(counter + ". Heads!!!");
			}else
				System.out.println(counter + ". Tails!!!");
		}
	}

}
