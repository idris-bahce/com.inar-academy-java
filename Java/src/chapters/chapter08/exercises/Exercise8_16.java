package chapters.chapter08.exercises;

public class Exercise8_16 {
    public static void main(String[] args) {
        int[][] arr = { {1, 7}, {1, 2},{4, 2}, {4, 5}, {4, 1}, {1, 1}};
        printTheArray(arr);
        System.out.println();
        sortTheArray(arr);
        printTheArray(arr);
    }

    private static void printTheArray(int[][] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0) {
                    System.out.print("{" + arr[i][j] + ",");
                } else {
                    System.out.print(arr[i][j] + "}");
                }
            }
        }
        System.out.print("}");
    }

    private static void sortTheArray(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[i][0] > arr[j][0]) {
                    int temp = arr[i][0];
                    int temp2 = arr[i][1];
                    arr[i][0] = arr[j][0];
                    arr[i][1] = arr[j][1];
                    arr[j][0] = temp;
                    arr[j][1] = temp2;
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[j][1] < arr[i][1]) && (arr[i][0] == arr[j][0])) {
                    int temp = arr[j][1];
                    arr[j][1] = arr[i][1];
                    arr[i][1] = temp;
                }
            }
        }
    }
}
