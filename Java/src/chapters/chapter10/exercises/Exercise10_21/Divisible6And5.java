package chapters.chapter10.exercises.Exercise10_21;

import java.math.BigInteger;

public class Divisible6And5 {
    public static void main(String[] args) {
        BigInteger num = new BigInteger("" + Long.MAX_VALUE);
        BigInteger divider5 = new BigInteger("5");
        BigInteger divider6 = new BigInteger("6");
        num = num.add(BigInteger.ONE);
        int counter = 0;
        while (counter <10){
            if (num.remainder(divider5).equals(BigInteger.ZERO)||num.remainder(divider6).equals(BigInteger.ZERO)){
                System.out.println(num);
                counter++;
            }
            num = num.add(BigInteger.ONE);
        }
    }
}
