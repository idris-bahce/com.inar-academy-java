package chapters.chapter06.listings06;

public class PrimeNumberMethod {
    public static void main(String[] args) {
        printPrimeNumbers(100);
    }

    private static void printPrimeNumbers(int amount) {
        int counter = 0;
        int num = 2;
        while (counter < amount) {
            if (isPrimeNum(num)) {
                System.out.printf("%4d", num);
                counter++;
                if (counter % 10 == 0)
                    System.out.println();
            }

            num++;
        }
    }

    public static boolean isPrimeNum(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
