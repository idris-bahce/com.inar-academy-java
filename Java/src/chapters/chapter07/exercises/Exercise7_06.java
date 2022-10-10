package chapters.chapter07.exercises;
//Unfinished
public class Exercise7_06 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;

        int[] primeNumbers = new int[NUMBER_OF_PRIMES];
        fillArray(primeNumbers);
        displayArray(primeNumbers);
    }

    public static void displayArray(int[] primeNumbers) {
        for (int i = 0; i < primeNumbers.length; i++) {
            if (i % 10 == 0)
                System.out.println();

            System.out.printf("%-4d",primeNumbers[i]);
        }
    }

    public static void fillArray(int[] primeNumbers) {
        int count = 0;
        int number = 2;

        while (count < primeNumbers.length) {
            if (isPrime(number, count, primeNumbers)) {
                primeNumbers[count] = number;
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int number, int count, int[] primeNumbers) {
        //It's until count because our array's all elements will be 0 after creating,
        // but we have to look at our numbers dividable with less prime numbers
        for (int i = 0; i < count; i++) {
            // Checking whether the number is dividable with the prime numbers that is less than number
            if (primeNumbers[i] <= Math.sqrt(number)) {
                if (number % primeNumbers[i] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
