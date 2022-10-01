package chapters.chapter06.excercises06;

public class Exercise6_14 {
    public static void main(String[] args) {
        System.out.println(" i           m(i)");
        System.out.println("---------------------");
        for (int i = 1; i <= 901; i+=100) {
            System.out.printf("%3d %15.4f",i,computePi(i));
            System.out.println();
        }
    }

    private static double computePi(int i) {
        double result = 0;
        double sum = 0;
        for (int j = 1; j <= i; j++) {
            sum +=(Math.pow(-1,j + 1)/(2.0 * j - 1));
            result =  4 * sum;
        }
        return result;
    }
}
