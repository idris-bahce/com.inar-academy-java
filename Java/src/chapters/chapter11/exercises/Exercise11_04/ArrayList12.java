package chapters.chapter11.exercises.Exercise11_04;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList12 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        getTheNumbers(list);
        System.out.println("Maximum value of this array is " + max(list));
    }

    private static void getTheNumbers(ArrayList<Integer> list) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter numbers and enter 0 to exit:");
        while (true){
            num = in.nextInt();
            if (num == 0){
                break;
            }
            list.add(num);
        }
    }

    public static Integer max(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        if (list.size() == 0){
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }
}
