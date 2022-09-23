package chapters.chapter05.chapter05checkpoints;

public class CheckPoint5_03 {
	public static void main(String[] args) {
		int a = 1;
		//while (a < 10)
		//if (a % 2 == 0)
		//System.out.println(a);
		//this is a unstopping and outputless loop
		
		//int i = 1;
		//while (i < 10)
		//if (i % 2 == 0)
		//System.out.println(i++);
		//this is a unstopping and outputless loop
		
		int i = 1;
		while (i < 10)
		if ((i++) % 2 == 0) {
		System.out.println(i);
		}
		//The loop body is executed nine times. The output is 3, 5, 7, 9 on separate lines.
	}

}
