package chapters.chapter07.checkpoints;

public class CheckPoint7_08 {
    public static void main(String[] args) {

        double[] arr = new double[10];

        arr[9]=5.5;

        double sum = 0;
        printSumOfFirstTwoElements(arr, sum);
        sumOfAllElements(arr);
        getTheMinimumElementInTheArray(arr);
        displayingRandomlyGeneratedIndexInArray(arr);
        newArray();
    }

    public static void newArray() {
        double[] array = new double[4];
        array[0] = 3.5;
        array[1] = 5.5;
        array[2] = 4.52;
        array[3] = 5.6;
    }

    public static void displayingRandomlyGeneratedIndexInArray(double[] arr) {
        int index = (int) (Math.random() * arr.length);
        System.out.println(arr[index]);
    }

    public static double getTheMinimumElementInTheArray(double[]arr) {
        double minimum = 0;
        for (int i = 0; i < arr.length; i++) {
            minimum = arr[0];
            if (minimum>arr[i]){
                minimum = arr[i];
            }
        }
        return minimum;
    }

    public static void sumOfAllElements(double[] arr) {
        double sum;
        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void printSumOfFirstTwoElements(double[] arr, double sum) {
        for (int i = 0; i < 2; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
