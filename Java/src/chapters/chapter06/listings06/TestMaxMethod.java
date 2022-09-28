package chapters.chapter06.listings06;

import java.util.Scanner;

public class TestMaxMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two integer:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int bigNum = TestMax.max(num1,num2);
        System.out.println(bigNum);
    }
}
