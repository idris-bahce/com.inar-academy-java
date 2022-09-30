package chapters.chapter06.excercises06;

public class Excercise6_01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%8d",getPentegonalNum(i));
            if (i % 10 == 0){
                System.out.println();
            }
        }
    }

    public static int getPentegonalNum(int n) {
        int result = n * (3 * n - 1)/2;
        return result;
    }
}
