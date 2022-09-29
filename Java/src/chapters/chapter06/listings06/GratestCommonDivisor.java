package chapters.chapter06.listings06;
import java.util.Scanner;
public class GratestCommonDivisor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int num1 = in.nextInt();
        System.out.println("Enter second integer: ");
        int num2 = in.nextInt();

        int gcd = gcd(num1, num2);

        System.out.println("The greatest common divisor of this two integers is:  " + gcd);
    }

    public static int gcd(int x, int y) {
        int greatestCommonDivisor = 1;
        int min = Math.min(x, y);
        for (int i = 1; i < min; i++) {
            if(x % i == 0 && y % i == 0){
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }
}
