package chapters.chapter08.exercises;

public class Exercise8_22 {
    public static void main(String[] args) {
        int[][] arr = getTheArray();
        displayArray(arr);
        if (hasEvenNumberOf1sInEveryRow(arr)&&hasEvenNumberOf1sInEveryColumn(arr)){
            System.out.println("Matrix has even number of 1s in its each column and row.");
        }else
            System.out.println("Matrix has not even number of 1s in its each column and row.");
    }

    private static boolean hasEvenNumberOf1sInEveryColumn(int[][] arr) {
        boolean isAllColTrue = false;
        for (int i = 0; i < arr.length; i++) {
            int oneCounter = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[j][i]==1){
                    oneCounter++;
                }
            }
            if (oneCounter%2==0){
                isAllColTrue = true;
            }
            else {
                isAllColTrue = false;
                break;
            }
        }
        if (isAllColTrue){
            return true;
        }else {
            return false;
        }
    }

    private static boolean hasEvenNumberOf1sInEveryRow(int[][] arr) {
        boolean isAllRowTrue = false;
        for (int i = 0; i < arr.length; i++) {
            int oneCounter = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==1){
                    oneCounter++;
                }
            }
            if (oneCounter%2==0){
                isAllRowTrue = true;
            }
            else {
                isAllRowTrue = false;
                break;
            }
        }
        if (isAllRowTrue){
            return true;
        }else {
            return false;
        }
    }

    private static void displayArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static int[][] getTheArray() {
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 2);
            }
        }
        return arr;
    }
}
