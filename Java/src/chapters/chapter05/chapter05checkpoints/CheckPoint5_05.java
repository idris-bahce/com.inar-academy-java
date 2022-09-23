package chapters.chapter05.chapter05checkpoints;

public class CheckPoint5_05 {
	public static void main(String[] args) {
		int x = 80000000;
		while (x > 0)
		x++;
		System.out.println("x is " + x);
	}//x is -2147483648
	//The reason: When a variable is assigned a value that is too large (in size) to be stored, it causes overflow.
	//2147483647 + 1 is actually -2147483648

}
