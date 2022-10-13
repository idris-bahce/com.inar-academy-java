package chapters.chapter08.checkpoints;

public class CheckPoint8_05 {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--)
            System.out.print(array[i][j] + " ");
            System.out.println();
        }
        System.out.println("normal print");// here we can see preceding printing is reversed printing
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }
}
