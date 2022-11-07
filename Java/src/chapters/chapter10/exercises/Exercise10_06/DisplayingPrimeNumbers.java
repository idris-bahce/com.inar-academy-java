package chapters.chapter10.exercises.Exercise10_06;

public class DisplayingPrimeNumbers {
    public static void main(String[] args) {
        int primeNumbers = 2;
        int counter = 0;
        while (primeNumbers<120){
            if (isPrime(primeNumbers)){
                System.out.print(primeNumbers + " ");
                counter++;
                if (counter%10==0)
                    System.out.println();
            }
            primeNumbers++;
        }
    }

    private static boolean isPrime(int primeNumbers) {
        if (primeNumbers==2){
            return true;
        }

        for (int divider = 2; divider <= primeNumbers / 2; divider++) {
            if (primeNumbers%divider==0){
                return false;
            }
        }
        return true;
    }
}
