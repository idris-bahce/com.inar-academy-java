package chapters.chapter07.exercises;

public class Exercise7_22 {
    public static void main(String[] args) {
        String[] arr = new String[8];
        java.util.Arrays.fill(arr, "|  ");
        printTheGame(arr);
    }

    public static void printTheGame(String[] arr) {
        int[] arrayOfQ = getAnArray();
        arrayOfQ = shuffleArrayOfQ(arrayOfQ);//this will be our Q sequence
        getTheResul(arr,arrayOfQ);
        String strQ = "|Q";//this will be our replacer.
        for (int i = 0; i < arrayOfQ.length; i++) {
            java.util.Arrays.fill(arr, "| ");
            for (int j = 0; j < arrayOfQ.length; j++) {
                String temp = arr[arrayOfQ[i]];//Here is like swapping but we are not swapping. We just get rid of "| "'s space and put there Q
                arr[arrayOfQ[i]] = strQ;
                for (int k = 0; k < arr.length; k++) {
                    System.out.print(arr[k]);
                }
                System.out.println("|");
                break;
            }
        }
    }

    public static int[] getAnArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void getTheResul(String[] arr, int[] arrayOfQ) {
        for (int i = 0; i < arr.length; i++) {

        }
    }

    public static int[] shuffleArrayOfQ(int[] arrayOfQ) {
        for (int i = 0; i < arrayOfQ.length; i++) {
            int random = (int) (Math.random() * 8);
            int temp = arrayOfQ[i];
            arrayOfQ[i] = arrayOfQ[random];
            arrayOfQ[random] = temp;
        }
        return arrayOfQ;
    }
}
