package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] list1 = new int[6];
        int[] list2 = new int[6];
        System.out.println("Enter list1");
        for (int i = 0; i < list1.length; i++) {
            list1[i] = in.nextInt();
        }
        System.out.println("Enter list2");
        for (int i = 0; i < list1.length; i++) {
            list2[i] = in.nextInt();
        }
        if (equals(list1,list2)){
            System.out.println("Two lists are strictly identical");
        }else
            System.out.println("Two lists are not strictly identical");
    }
    public static boolean equals(int[] list1, int[] list2){

        boolean isSame = false;
        for (int i = 0; i < list1.length; i++) {
            if (list1[i]==list2[i]){
                isSame = true;
            }else
                isSame = false;
        }
        if (isSame)
            return true;
        else
            return false;
    }
}
