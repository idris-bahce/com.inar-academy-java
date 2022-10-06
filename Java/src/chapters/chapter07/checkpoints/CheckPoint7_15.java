package chapters.chapter07.checkpoints;

public class CheckPoint7_15 {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 5, 4};
        for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {//it is not working because program is reversing it two times:
            // Swap list[i] with list[j]                                       first from the beginning and then from the end.
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
        for (int a :
                list) {
            System.out.print(a + " ");
        }
    }
}
