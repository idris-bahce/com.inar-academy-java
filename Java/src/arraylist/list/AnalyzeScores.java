package arraylist.list;

import java.util.ArrayList;
import java.util.Scanner;

public class AnalyzeScores {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter scores: ");
        while (true){
            double score = in.nextDouble();
            if (score<0){
                break;
            }
            list.add(score);
        }
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }
        double average = sum / list.size();
        int numberOfAbove = 0;
        int numberOfBelow = 0;

        for (int i = 0; i < list.size(); i++) {
            if (average>list.get(i)){
                numberOfAbove++;
            }else
                numberOfBelow++;
        }
        System.out.println(numberOfAbove + " scores are above average and " + numberOfBelow + " scores are below average.");
    }
}
