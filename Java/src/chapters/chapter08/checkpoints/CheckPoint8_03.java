package chapters.chapter08.checkpoints;

public class CheckPoint8_03 {
    public static void main(String[] args) {
        int[][] array = new int[5][6];
        int[] x ={1, 2};
        array[0] = x;
        System.out.println("array[0][1] is " + array[0][1]);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();// as we can see here firs row has not 6 elements but 2, because of the assignment
        }
    }

}
