package chapters.chapter06.excercises06;

public class Exercise6_27 {
    public static void main(String[] args) {
        int primeNumber = 13;
        int counter = 0;//it will be our prime number and palindrome counter.
        while (counter < 100) {
            if (isPrimeNumbers(primeNumber)) {
                if (isEmirp(primeNumber)) {
                    System.out.print(primeNumber + " ");
                    counter++;
                    if (counter % 10 == 0) {
                        System.out.println();
                    }
                }
            }

            primeNumber++;
        }
    }

    private static boolean isPrimeNumbers(int primeNumber) {

        for (int i = 2; i <= primeNumber / 2; i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isEmirp(int i) {

        String num = "";
        num = num + i;
        String reversedNum = "";
        for (int j = 0; j < num.length(); j++) {
            char ch = num.charAt(j);
            reversedNum = ch + reversedNum;
        }
        int reversedNumber = Integer.parseInt(reversedNum);
        if (isPrimeNumbers(reversedNumber)&&!isPalindromic(reversedNumber)) {
            return true;
        } else
            return false;

    }

    public static boolean isPalindromic(int i) {
        String num = "";
        num = num + i;
        String reversedNum = "";
        for (int j = 0; j < num.length(); j++) {
            char ch = num.charAt(j);
            reversedNum = ch + reversedNum;
        }
        if (num.equals(reversedNum)) {
            return true;
        } else
            return false;
    }
}
