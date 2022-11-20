package chapters.chapter11.exercises.Exercise11_15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Polygon {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        int num = fillTheList(list);
        Collections.reverse(list);//input has been made in clockwise. We need to reverse it because formula is available for counter-clockwise
        calculateTheArea(list,num);
    }

    private static void calculateTheArea(ArrayList<Double> list, int num) {
        double sum = 0;
        double sum2 = 0;
        for (int i = 0; i < (num * 2) - 3; i++) {
            sum += list.get(i) * list.get(i + 3);
        }
        sum += list.get(list.size() - 2) * list.get(1);

        for (int i = 1; i < (num * 2) - 2; i++) {
            sum2 += list.get(i) * list.get(i + 1);
        }
        sum2 += list.get(list.size() - 1) * list.get(0);
        double result = Math.abs(sum - sum2)/2;
        System.out.println("The total area is: " + result);
    }

    private static int fillTheList(ArrayList<Double> list) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of the points: ");
        int num = in.nextInt();
        System.out.println("\nEnter the coordinates of the points:");
        for (int i = 0; i < num * 2; i++) {
            list.add(in.nextDouble());
        }
        return num;
    }
}
