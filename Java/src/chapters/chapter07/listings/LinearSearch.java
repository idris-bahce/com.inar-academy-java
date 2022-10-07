package chapters.chapter07.listings;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,};

        System.out.println(linearSearch(arr,3));
    }

    private static int linearSearch(int[] arr, int key) {
        for (int j = 0; j < arr.length; j++) {
            if (key == arr[j]){
                return j;
            }
        }
        return -1;
    }
}
