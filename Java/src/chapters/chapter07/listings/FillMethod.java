package chapters.chapter07.listings;

public class FillMethod {
    public static void main(String[] args) {
        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 7, 7, 10};
        java.util.Arrays.fill(list1, 5);
        java.util.Arrays.fill(list2, 1, 5, 8);
        for (int a :
                list2) {
            System.out.print(a + " ");
        }
    }
}
