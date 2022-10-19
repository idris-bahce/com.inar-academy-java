package chapters.chapter08.exercises;

public class Exercise8_18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        printArray(m);
        shuffleRows(m);
        System.out.println("\n----------------------");
        printArray(m);
    }

    private static void shuffleRows(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int random = (int) (Math.random() * m.length);
            int temp = m[i][0];
            int temp2 = m[i][1];
            m[i][0] = m[random][0];
            m[i][1] = m[random][1];
            m[random][0] = temp;
            m[random][1] = temp2;
        }
    }

    public static void printArray(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
