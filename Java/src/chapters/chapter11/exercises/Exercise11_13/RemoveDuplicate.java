package chapters.chapter11.exercises.Exercise11_13;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        fillTheArray(list);
        ArrayList<Integer> result = getTheDistinctArray(list);
        System.out.print("The distinct integers are: ");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }

    private static ArrayList<Integer> getTheDistinctArray(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!isInResultArray(list.get(i), result)){
                result.add(list.get(i));
            }
        }
        return result;
    }

    private static boolean isInResultArray(Integer integer, ArrayList<Integer> result) {
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).equals(integer)){
                return true;
            }
        }
        return false;
    }


    private static void fillTheArray(ArrayList<Integer> list) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ten integers:");
        for (int i = 0; i < 10; i++) {
            list.add(in.nextInt());
        }
    }
}
