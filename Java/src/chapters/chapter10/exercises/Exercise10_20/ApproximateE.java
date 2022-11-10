package chapters.chapter10.exercises.Exercise10_20;

import java.math.BigDecimal;

public class ApproximateE {
    public static void main(String[] args) {
        BigDecimal e = new BigDecimal("1");
        printE(100,e);
        printE(200,e);
        printE(1000,e);
    }

    private static void printE(int i,BigDecimal e) {
        for (int j = 1; j <= i; j++) {
            e = e.add(BigDecimal.ONE.divide(factorial(new BigDecimal(j)),25,BigDecimal.ROUND_UP));
        }
        System.out.println(e);
    }

    private static BigDecimal factorial(BigDecimal i) {
        int stop = i.intValue();
        for (int j = 1; j <= stop; j++) {
            i = i.multiply(new BigDecimal(j));
        }
        return i;
    }
}
