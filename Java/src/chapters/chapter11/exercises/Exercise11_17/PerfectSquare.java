package chapters.chapter11.exercises.Exercise11_17;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int m = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        findTheFactors(list,m);
        int n = findTheN(list);
        System.out.println("The smallest number n for m * n to be a perfect square is " + n +
                "\nm * n is " + (m * n));
    }

    private static int findTheN(ArrayList<Integer> list) {
        int numberOfDivisors;
        int divisor = 2;
        int n = 1;
        while ((list.get(list.size() - 1)) >= divisor){
            numberOfDivisors = 0;
            if (isInList(divisor,list)){
                numberOfDivisors = getTheNumberOfDivisors(divisor,list);
                if (numberOfDivisors % 2 != 0){
                    n *= divisor;
                }
            }
            divisor++;

        }
        return n;
    }

    private static int getTheNumberOfDivisors(int divisor, ArrayList<Integer> list) {
        int numberOfDivisor = 0;
        for (int i = 0; i < list.size(); i++) {
            if (divisor == list.get(i)){
                numberOfDivisor++;
            }
        }
        return numberOfDivisor;
    }

    private static boolean isInList(int divisor, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (divisor == list.get(i)){
                return true;
            }

        }
        return false;
    }

    private static void findTheFactors(ArrayList<Integer> list, int num) {
        int divisor = 2;
        while (num != 1){
            if (num % divisor == 0){
                num /= divisor;
                list.add(divisor);
            }else {
                divisor++;
            }
        }
    }
}
