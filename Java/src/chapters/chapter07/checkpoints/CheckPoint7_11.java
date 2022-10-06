package chapters.chapter07.checkpoints;

public class CheckPoint7_11 {
    public static void main(String[] args) {
        int list[] = {1, 2, 3, 4, 5, 6};
        for (int i = 1; i < list.length; i++)
            list[i] = list[i - 1];

        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
        printShiftingToRight();
    }

    public static void printShiftingToRight() {
        int list[] = {1, 2, 3, 4, 5, 6};

        int lastElement = list[list.length-1];
        for (int i = list.length - 1; i > 0; i--) {
            list[i] = list[i - 1];
        }
        list[0] = lastElement;
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
