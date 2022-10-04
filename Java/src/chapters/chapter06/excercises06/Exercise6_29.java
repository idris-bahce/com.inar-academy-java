package chapters.chapter06.excercises06;

public class Exercise6_29 {
    public static void main(String[] args) {
        int primeNumber = 2;
        int primeNumber2 = 1;
        while (primeNumber <= 1000){
            if (isPrime(primeNumber)){
                if (twinPrime(primeNumber,primeNumber2)){
                    System.out.println("(" + primeNumber2 + ", " + primeNumber + ")");
                }
                primeNumber2 = primeNumber;
            }
            primeNumber++;
        }

    }

    public static boolean twinPrime(int primeNumber, int primeNumber2) {
        if (primeNumber - primeNumber2 == 2)
            return true;
        return false;
    }

    public static boolean isPrime(int prime) {
        for (int i = 2; i <= prime/2 ; i++) {
            if (prime%i==0)
                return false;
        }
        return true;
    }
}
