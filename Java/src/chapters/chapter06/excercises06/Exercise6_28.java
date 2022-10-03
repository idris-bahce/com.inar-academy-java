package chapters.chapter06.excercises06;

public class Exercise6_28 {
    public static void main(String[] args) {
        System.out.println("         p \t\t    2^p-1");
        System.out.println("       -------------------");
        int primeNumber = 2;
        int counter = 1;
        while (counter <= 31){
            if (isPrime(primeNumber)){
                System.out.printf("%2d.", counter);
                System.out.printf(" %6d %14d", primeNumber,getMersenneNum(primeNumber));
                System.out.println();
                counter++;
            }


            primeNumber++;
        }
    }

    public static int getMersenneNum(int num) {
        int mersenneNum =(int)(Math.pow(2,num) - 1);
        return mersenneNum;
    }

    public static boolean isPrime(int prime) {
        for (int i = 2; i <= prime/2 ; i++) {
            if (prime%i==0)
                return false;
        }
        return true;
    }
}
