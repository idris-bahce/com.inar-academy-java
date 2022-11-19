package chapters.chapter11.exercises.Exercise11_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        fillTheList(list);
        double sumOfArray = sumArray(list);
        System.out.println("Sum of the numbers is: " + sumOfArray);
    }

    private static double sumArray(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    private static void fillTheList(ArrayList<Double> list) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter double numbers and press 0 to exit:");
        double input;
        while (true){
            input = in.nextDouble();
            if (input == 0){
                break;
            }
            list.add(input);
        }
    }
}
