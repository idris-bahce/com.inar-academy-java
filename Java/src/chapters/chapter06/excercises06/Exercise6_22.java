package chapters.chapter06.excercises06;

public class Exercise6_22 {
    public static void main(String[] args) {
        System.out.println(sqrt(16));
    }

    public static double sqrt(long n) {
        double nextGuess = 1.2;
        double lastGuess = 1;
        while (nextGuess - lastGuess != 0) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;


        }
        return nextGuess;
    }
}
