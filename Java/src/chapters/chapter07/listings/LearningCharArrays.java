package chapters.chapter07.listings;

public class LearningCharArrays {
    public static void main(String[] args) {
        char[] arr = new char[6];
        arr[0]='L';
        arr[1]='O';
        arr[2]='N';
        arr[3]='D';
        arr[4]='O';
        arr[5]='N';

        System.out.println(arr);
        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i;
        }
        System.out.println(arr2[3]);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
