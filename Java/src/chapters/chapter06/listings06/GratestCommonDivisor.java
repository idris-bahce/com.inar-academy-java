package chapters.chapter06.listings06;
import java.util.Scanner;
public class GratestCommonDivisor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int num1 = in.nextInt();
        System.out.println("Enter second integer: ");
        int num2 = in.nextInt();

        int sgcd = getSgcd(num1, num2);
        System.out.println("Greatest common divisor of this two integers is: " + sgcd);
    }

    private static int getSgcd(int num1, int num2) {
        int sgcd = 1;
        int divisor = 2;

        while (divisor <= num1 && divisor <= num2) {
            if (num1 % divisor == 0 && num2 % divisor == 0) {
                sgcd=divisor;
            }
            divisor++;
        }
        return sgcd;
    }
}
