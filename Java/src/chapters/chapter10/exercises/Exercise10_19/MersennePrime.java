package chapters.chapter10.exercises.Exercise10_19;

import java.math.BigInteger;

public class MersennePrime {
    public static void main(String[] args) {
        BigInteger mersenne = new BigInteger("2");
        BigInteger power = new BigInteger("2");
        int counter = 0;
        while (counter <100){
            BigInteger number = mersenne.multiply(power).subtract(BigInteger.ONE);
            if(isPrime(number)) {
                System.out.println((counter + 1) + "-->" + number);
                counter++;
            }
            mersenne = mersenne.multiply(power);
        }
    }
    private static boolean isPrime(BigInteger num) {
        BigInteger divisor = new BigInteger("2");
        BigInteger stop = new BigInteger(String.valueOf(num.divide(divisor)));
        while (divisor.compareTo(stop)!=0){
            if (num.remainder(divisor).equals(BigInteger.ZERO)){
                return false;
            }
            divisor = divisor.add(BigInteger.ONE);
        }
        return true;
    }
}
