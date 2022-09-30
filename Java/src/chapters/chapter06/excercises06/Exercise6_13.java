package chapters.chapter06.excercises06;

public class Exercise6_13 {
    public static void main(String[] args) {
        System.out.println("i        m(i)");
        System.out.println("-------------");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%2d %10.4f",i,sum(i) );
            System.out.println();
        }


    }

    private static double sum(int i) {
        double result = 0;
        for (int j = 1; j <= i; j++) {
            result += j / (j + 1.0);
        }
        return result;
    }
}
