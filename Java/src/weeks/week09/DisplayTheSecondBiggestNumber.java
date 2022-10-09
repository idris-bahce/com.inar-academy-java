package weeks.week09;

public class DisplayTheSecondBiggestNumber {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr = getTheElementsOfTHeArray(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        int secondMax = getTheSecondMax(arr);
        System.out.println(secondMax);
    }

    public static int getTheSecondMax(int[] arr) {
        int max = getMax(arr);
        int secondMax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        return secondMax;

    }

    private static int getMax(int[] arr) {
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] getTheElementsOfTHeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
