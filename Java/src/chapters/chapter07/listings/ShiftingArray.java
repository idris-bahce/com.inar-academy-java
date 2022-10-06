package chapters.chapter07.listings;

public class ShiftingArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int firstElement = arr[0];
        for (int i = 0; i < arr.length- 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstElement;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int lastElement = arr[arr.length - 1];//shifting right is not simple as it is compared to shifting left
        for (int i = 1; i < arr.length ; i++) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
