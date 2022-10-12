package chapters.chapter08.listings;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        fillWithRandomValues(arr);
        printTheArray(arr);
        printTheSumOfAllElements(arr);
        printTheSumOfColumns(arr);
        printWhichColumnHasTheBiggestSum(arr);
        printTheMaxRow(arr);
        printTheShuffledArray(arr);
        printTheArray(arr);
    }

    private static void printTheShuffledArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int randomI = (int) (Math.random() * arr.length);
                int randomJ = (int) (Math.random() * arr[i].length);
                int temp = arr[i][j];
                arr[i][j] = arr[randomI][randomJ];
                arr[randomI][randomJ] = temp;
            }
        }

    }

    private static void printTheMaxRow(int[][] arr) {
        int maxRow = 0;
        int maxIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (maxRow<sum){
                maxRow = sum;
                maxIndex = i;
            }
        }
        System.out.println("The maximum row is " + (maxIndex +1) + ", which has value of " + maxRow);
    }

    private static void printWhichColumnHasTheBiggestSum(int[][] arr) {
        int biggestSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[j][i];
            }if (sum>biggestSum){
                biggestSum = sum;
            }
        }
        System.out.println("The biggest sum is: " + biggestSum);
    }

    private static void printTheSumOfColumns(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            int sumOfColumns = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sumOfColumns += arr[j][i];

            } System.out.println("Sum of the " + (i + 1) + ". columns is: " + sumOfColumns);
        }

    }

    private static void printTheSumOfAllElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("The sum of all elements is: " + sum);
    }

    private static void printTheArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }

    private static void fillWithRandomValues(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
    }
}
