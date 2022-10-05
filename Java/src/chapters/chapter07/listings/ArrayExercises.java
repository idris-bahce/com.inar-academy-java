package chapters.chapter07.listings;

public class ArrayExercises {
    public static void main(String[] args) {
        int[] arr = new int[100];

        appointNumbersToArray(arr);
        printElementsOfArray(arr);
        System.out.println("Sum of array's elements is: " + getSum(arr));
        System.out.println("The biggest number of this array is: " + getTheBiggestElement(arr));
        System.out.println("The smallest index of biggest element is: " + getTheSmallestIndexOfTheBiggestElement(arr));
        System.out.println("Lets shuffle the array. Shuffled array is: ");
        printShuffledArray(arr);
        System.out.println("Lets shift the elements of array. Shifted array to left by one is: ");
        printLeftShiftedArray(arr);
    }

    public static void printLeftShiftedArray(int[] arr) {
        int firstElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
            arr[arr.length - 1] = firstElement;
        }
        printElementsOfArray(arr);

    }

    public static void printShuffledArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int random = (int)(Math.random() * arr.length);

            int temp = arr[i];
            arr[i] = arr[random];
            arr[random] = temp;
            System.out.printf("%3d", arr[i]);
            if((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }

    public static int getTheSmallestIndexOfTheBiggestElement(int[] arr) {
        int biggestNum = 0;
        int smallestIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>biggestNum){
                biggestNum = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;


    }

    public static void appointNumbersToArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random() * 100);
        }
    }

    public static void printElementsOfArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d", arr[i]);
            if((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int getTheBiggestElement(int[] arr){
        int biggestNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>biggestNum){
                biggestNum = arr[i];
            }
        }
        return biggestNum;
    }
}
