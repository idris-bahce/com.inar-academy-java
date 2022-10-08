package chapters.chapter07.exercises;

public class Exercise7_07 {
    public static void main(String[] args) {
        int[] arrayOfHundertDigit = getTheHundertDigitArray();
        int[] counter = new int[10];
        counter = getTheOccurencesOfNumbers(arrayOfHundertDigit,counter);
        printTheResults(counter,arrayOfHundertDigit);

    }

    public static void printTheResults(int[] counter, int[] arrayOfHundertDigit) {
        for (int i = 0; i < counter.length; i++) {
            System.out.print(i + ":" + counter[i] + ", ");
        }
    }


    public static int[] getTheOccurencesOfNumbers(int[] arrayOfHundertDigit, int[] counter) {
        for (int i = 0; i < arrayOfHundertDigit.length; i++) {
            counter[arrayOfHundertDigit[i]]++;
        }
        return counter;
    }

    private static int[] getTheHundertDigitArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10);
        }
        return arr;
    }
}
