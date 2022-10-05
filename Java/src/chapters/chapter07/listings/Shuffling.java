package chapters.chapter07.listings;

public class Shuffling {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int random = (int) (Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[random];
            arr[random] = temp;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            int j = (int) (Math.random() * (i + 1));

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
