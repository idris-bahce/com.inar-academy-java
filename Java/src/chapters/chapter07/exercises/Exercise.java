package chapters.chapter07.exercises;

public class Exercise {
    public static void main(String[] args) {
        String[] arr = new String[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = " |";// Our main structure array. We will place the "Q" one by one in it.
        }
        int[] arrayForLastQ = new int[8];// we will put the places of "Q"s into this array to put the last Q
        int placeOfQ = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("|");
            if (i == 7) {//if we are in the last row of the table, we should put the Q by ourselves.
                int lastPlaceOfQ = getTheLastPlace(arrayForLastQ);// Because our algorithm puts it the place where the first Q is.
                lastPlaceOfQ = lastPlaceOfQ % 8;
                arr[lastPlaceOfQ] = "Q|";
            } else {
                arr[placeOfQ] = "Q|";
            }
            printArray(arr);
            System.out.println();
            java.util.Arrays.fill(arr, " |");
            arrayForLastQ[i] = placeOfQ;//Here we put the places of Qs.
            placeOfQ += 2;
            if (placeOfQ >= 8) {
                placeOfQ = placeOfQ % 7;
            }

        }

    }

    private static int getTheLastPlace(int[] arrayForLastQ) {
        int sum = 0;
        for (int i = 0; i < arrayForLastQ.length; i++) {
            sum += arrayForLastQ[i];
        }
        int lastPlace = 28 - sum;//28 is the sum of the numbers from 0 to 7 inclusive. If we abstract the sum from 28
        return lastPlace;       // we will find the missing number between 0 and 7
    }

    private static void printArray(String[] arr) {
        for (int i = 0; i < 8; i++) {
            System.out.print(arr[i]);
        }
    }
}
