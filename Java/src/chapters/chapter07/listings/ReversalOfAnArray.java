package chapters.chapter07.listings;

public class ReversalOfAnArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println("Reversed array is: " );

        int[] array = getReversedArray(arr);
        for (int a :
                array) {
            System.out.print(a + " ");
        }

    }

    public static int[] getReversedArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0, j = arr.length -1; i < arr.length; i++,j--) {
            result[j] = arr[i];
        }
        return result;
    }
}
