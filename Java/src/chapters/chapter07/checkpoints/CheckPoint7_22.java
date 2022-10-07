package chapters.chapter07.checkpoints;

import chapters.chapter07.listings.BinarySearch;

public class CheckPoint7_22 {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(BinarySearch.binarySearch(list,10));
        System.out.println(BinarySearch.binarySearch(list,12));
    }
}
