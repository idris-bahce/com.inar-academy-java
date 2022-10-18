package chapters.chapter08.exercises;

public class Exercise8_10 {
    public static void main(String[] args) {
        int[][] arr = getTheRandomArray();
        printTheArray(arr);
        int indexOfTheMostOneFilledRow = getTheIndexOfTheMostOneFilledRow(arr);
        int indexOfTheMostOneFilledColumn = getTheIndexOfTheMostOneFilledColumn(arr);
        System.out.println("The largest row index: " + indexOfTheMostOneFilledRow);
        System.out.println("The largest column index: " + indexOfTheMostOneFilledColumn);
    }

    private static int getTheIndexOfTheMostOneFilledColumn(int[][] arr) {
        int maxOnes = -1;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[j][i] == 1){
                    counter++;
                }
            }
            if (counter>maxOnes){
                maxOnes = counter;
                index = i;
            }
        }
        return index;
    }

    private static int getTheIndexOfTheMostOneFilledRow(int[][] arr) {

        int maxOnes = -1;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1){
                    counter++;
                }
            }
            if (counter>maxOnes){
                maxOnes = counter;
                index = i;
            }
        }
        return index;
    }

    private static void printTheArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] getTheRandomArray() {

        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 2);
            }
        }
        return arr;
    }
}
