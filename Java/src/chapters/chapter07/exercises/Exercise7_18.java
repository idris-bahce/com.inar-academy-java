package chapters.chapter07.exercises;

public class Exercise7_18 {
    public static void main(String[] args) {
        int[] arr = getTheRandomArray();
        printTheArray(arr);
        System.out.println();
        sortTheArray(arr);
        printTheSortedArray(arr);
    }

    public static void printTheSortedArray(int[] arr) {
        for (int a :
                arr) {
            System.out.print(a + " ");
        }
    }

    public static void sortTheArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printTheArray(int[] arr) {
        for (int a :
                arr) {
            System.out.print(a + " ");
        }
    }

    public static int[] getTheRandomArray() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        return arr;
    }
}
