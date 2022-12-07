package homework.set;

import java.util.HashSet;
import java.util.Set;

public class Prime {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int number = 2;
        Set<Integer> primeNumbers = new HashSet<>();

        System.out.println("The first 50 prime numbers are \n");

        while (primeNumbers.size() < NUMBER_OF_PRIMES) {
            if (isPrime(number,primeNumbers)){
                primeNumbers.add(number);
            }
            number++;
        }
        int count = 0;
        for (int prime: primeNumbers  ) {
            System.out.printf("%4d," ,prime);
            count++;
            if(count % NUMBER_OF_PRIMES_PER_LINE == 0){
                System.out.println();
            }
        }
    }
    private static boolean isPrime(int number,Set<Integer> primeNumbers){
        for (int prime : primeNumbers) {
            if(prime <= Math.sqrt(number) && number % prime == 0){
                return false;
            }
        }
        return true;
    }
}
