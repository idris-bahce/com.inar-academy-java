package chapters.chapter07.exercises;

public class Exercise7_04 {
    public static void main(String[] args) {
        int[] arr = new int[52];
        for (int i = 1; i < 53; i++) {
            arr[i - 1] = i;
        }
        for (int a :
                arr) {
            System.out.print(a + " ");
        }
    }
}
