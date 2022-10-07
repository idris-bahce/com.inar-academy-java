package chapters.chapter07.exercises;

public class Exercise7_02 {
    public static void main(String[] args) {
        int[] arr = getArray();
        System.out.println("This is our array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nAnd this is our reversed array: ");
        int[] reversedArray = getReversedArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
    public static int[] getReversedArray(int[] arr){
        for (int i = 0, j = arr.length - 1; i < arr.length/2; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static int[] getArray() {
        int[] arr = new int[11];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}
