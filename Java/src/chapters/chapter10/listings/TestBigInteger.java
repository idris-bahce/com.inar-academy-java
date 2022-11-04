package chapters.chapter10.listings;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestBigInteger {

    public static void main(String[] args) {
        BigInteger a = new BigInteger("9223372036854775807");
        BigInteger b = new BigInteger("251516295195989854159156591");
        BigInteger c = a.multiply(b); // 9223372036854775807 * 251516295195989854159156591
        System.out.println(c);

        BigDecimal a1 = new BigDecimal(1.0);
        BigDecimal b1 = new BigDecimal(3);
        BigDecimal c1 = a1.divide(b1, 20, BigDecimal.ROUND_UP);
        System.out.println(c1);
    }
}
