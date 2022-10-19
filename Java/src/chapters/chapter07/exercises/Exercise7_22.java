package chapters.chapter07.exercises;

public class Exercise7_22 {
    public static void main(String[] args) {
        String[] arr = new String[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = " |";// Our main structure array. We will place the "Q" one by one in it.
        }
        int placeOfQ = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("|");
            arr[placeOfQ] = "Q|";
            printArray(arr);
            System.out.println();
            java.util.Arrays.fill(arr, " |");
            placeOfQ += 2;
            if (placeOfQ >= 8) {
                placeOfQ = placeOfQ % 7;
            }

        }

    }
    private static void printArray(String[] arr) {
        for (int i = 0; i < 8; i++) {
            System.out.print(arr[i]);
        }
    }
}
