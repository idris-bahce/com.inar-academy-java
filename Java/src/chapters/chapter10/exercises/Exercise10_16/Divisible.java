package chapters.chapter10.exercises.Exercise10_16;

import java.math.BigInteger;

public class Divisible {
    public static void main(String[] args) {
        BigInteger big = new BigInteger("10000000000000000000000000000000000000000000000000");
        BigInteger big1 = new BigInteger("2");
        BigInteger big2 = new BigInteger("3");
        int counter = 0;
        while (counter < 10) {
            if ((big.remainder(big1).equals(BigInteger.ZERO))||(big.remainder(big2).equals(BigInteger.ZERO))){
                System.out.println((counter + 1) + ".-->" + big);
                counter++;
            }
            big = big.add(BigInteger.ONE);
        }
    }
}
