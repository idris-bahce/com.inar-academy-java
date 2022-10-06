package chapters.chapter07.listings;

import chapters.chapter06.listings06.RandomCharacter;

public class CountingTheOccurrences {
    public static void main(String[] args) {
        char[] arr = getArray();
        System.out.println("Here is our array: ");
        printArray(arr);
        System.out.println("Here is the number of  the characters in the array: ");
        int[] counter =getCounter(arr);
        printCounter(arr,counter);
    }

    public static void printCounter(char[]arr,int[]counter) {
        for (int i = 0; i < counter.length; i++) {
            if((i+1)% 10 == 0){
                System.out.println((char) ('a' + i) + ":" + counter[i] );
            }else {
                System.out.print((char) ('a' + i) + ":" + counter[i] + " ");
            }
        }
    }

    public static int[] getCounter(char[] arr) {
        int[] counter = new int[26];
        for (int i = 0; i < arr.length; i++) {
            counter[arr[i] - 'a']++;
        }
        return counter;
    }

    public static void printArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if ((i + 1) % 20 == 0){
                System.out.println();
            }
        }
    }

    public static char[] getArray() {
        char[] arr = new char[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RandomCharacter.getRandomLowerCaseLetter();
        }
        return arr;
    }
}
