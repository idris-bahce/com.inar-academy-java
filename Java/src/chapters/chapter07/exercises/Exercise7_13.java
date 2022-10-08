package chapters.chapter07.exercises;

public class Exercise7_13 {
    public static void main(String[] args) {
        System.out.println(getRandom(1, 2, 3, 4));
    }

    public static int getRandom(int... numbers) {
        boolean isNumberReturning = true;
        int randomNumber = 0;
        while (isNumberReturning) {
            randomNumber = (int) (Math.random() * 53 + 1);
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == randomNumber) {
                    isNumberReturning = true;
                }else {
                    isNumberReturning = false;
                }
            }
        }
        return randomNumber;
    }
}
