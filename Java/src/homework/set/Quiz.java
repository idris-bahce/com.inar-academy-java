package homework.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Quiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int questionCounter = 0;
        Set<Integer> listOfWrongAnswers = new HashSet<>();
        while (questionCounter < 10) {
            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);
            System.out.print("What is " + num1 + " + " + num2 + " = ?");
            int answer = in.nextInt();
            if (answer == num1 + num2){
                System.out.println("True!");
            }
            while (answer != num1 + num2){
                System.out.println("Wrong!");
                if(!listOfWrongAnswers.add(answer)){
                    System.out.println("You already try this number!");
                }
                System.out.print("So... What is " + num1 + " + " + num2 + " = ?");
                answer = in.nextInt();
                if (answer == num1 + num2){
                    System.out.println("True!");
                    break;
                }
            }
            listOfWrongAnswers.clear();//we clear when we end the question
            questionCounter++;
        }
    }
}