package chapters.chapter07.exercises;

public class Exercise7_06 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        int[] primeNum = new int[NUMBER_OF_PRIMES];
        getThePrimeNumbers(primeNum,NUMBER_OF_PRIMES);
        printThePrimeNumbers(primeNum);
    }

    private static void printThePrimeNumbers(int[] primeNum) {
        for (int i = 0; i < primeNum.length; i++) {
            System.out.printf("%4d",primeNum[i]);
            if ((i + 1) % 10 == 0){
                System.out.println();
            }
        }
    }

    private static void getThePrimeNumbers(int[] primeNum, int NUMBER_OF_PRIMES) {
        int index = 0;
        int prime = 2;
        while (index<NUMBER_OF_PRIMES) {

            if (isPrime(index,prime,primeNum)){
                primeNum[index] = prime;
                index++;
            }
            prime++;
        }

    }

    private static boolean isPrime(int index, int prime, int[] primeNum) {

        for (int i = 0; i < index; i++) {
            if (primeNum[i]<=Math.sqrt(prime)){
                if (prime%primeNum[i] == 0)
                    return false;
            }
        }
        return true;
    }
}
