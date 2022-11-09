package chapters.chapter10.exercises.Exercise10_18;

import java.math.BigInteger;

public class PrimeNumber {
    public static void main(String[] args) {
        BigInteger big = new BigInteger("" + Long.MAX_VALUE);
        int counter = 0;
        System.out.println("Max of long: " + big);
        System.out.println("---------------------------------");
        while (counter<5){
            if (isPrime(big)){
                System.out.println(big);
                counter++;
            }
            big = big.add(BigInteger.ONE);
        }
    }

    private static boolean isPrime(BigInteger big) {
        BigInteger divisor = new BigInteger("2");
        BigInteger stop = new BigInteger(String.valueOf(big.divide(divisor)));
        while (divisor.compareTo(stop)!=0){
            if (big.remainder(divisor).equals("0")){
                return false;
            }
            divisor = divisor.add(BigInteger.ONE);
        }
        return true;
    }
}
