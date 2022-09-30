package chapters.chapter06.excercises06;

public class Exercise6_10 {
    public static void main(String[] args) {
        int liner = 0;//with this variable i will be able to print all ten per line
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)){
                System.out.printf("%5d",i);
                liner++;
                if (liner % 10 == 0)
                    System.out.println();
            }
        }
    }
    private static boolean isPrime(int num) {
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
