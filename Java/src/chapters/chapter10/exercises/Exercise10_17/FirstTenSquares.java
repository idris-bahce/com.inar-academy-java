package chapters.chapter10.exercises.Exercise10_17;

import java.math.BigInteger;

public class FirstTenSquares {
    public static void main(String[] args) {
        long maxLongSquareNumber = ((long)Math.sqrt(Long.MAX_VALUE));
        BigInteger big = new BigInteger("" + maxLongSquareNumber );
        BigInteger maxLong = new BigInteger("" + Long.MAX_VALUE);
        System.out.println(maxLong);
        System.out.println("----------------");
        int counter = 0;
        while (counter < 10){
            big = big.add(BigInteger.ONE);
            if (big.compareTo(maxLong)<0) {
                System.out.println((counter + 1) + ".-->" + big.multiply(big));
                counter++;
            }
        }
    }
}
