package chapters.chapter11.exercises.Exercise11_16;

import java.util.ArrayList;
import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int questionCounter = 0;
        ArrayList<Integer> listOfWrongAnswers = new ArrayList<>();
        while (questionCounter<10){
            int num1 = (int)(Math.random() * 10);
            int num2 = (int)(Math.random() * 10);
            System.out.print("What is " + num1 + " + " + num2 + " = ?" );
            int answer = in.nextInt();
            if (answer == num1 + num2){
                System.out.print("You got it!");
            }else {
                while (true) {
                    if (isInListOfWrongAnswer(listOfWrongAnswers, answer)) {
                        listOfWrongAnswers.add(answer);// we have to add answers to the list here.
                        System.out.print("You already entered " + answer + ". ");
                        System.out.print("What is " + num1 + " + " + num2 + " = ?" );
                        answer = in.nextInt();
                        if (answer == num1 + num2){
                            System.out.print("You got it!");
                            break;
                        }
                    } else {
                        listOfWrongAnswers.add(answer);
                        System.out.print("Wrong answer! Try again.");
                        System.out.print("What is " + num1 + " + " + num2 + " = ?" );
                        answer = in.nextInt();
                        if (answer == num1 + num2){
                            System.out.print("You got it!");
                            break;
                        }
                    }
                }
            }
            questionCounter++;
            listOfWrongAnswers.clear();
        }
    }

    private static boolean isInListOfWrongAnswer(ArrayList<Integer> listOfWrongAnswers, int answer) {
        for (int i = 0; i < listOfWrongAnswers.size(); i++) {
            if (answer == listOfWrongAnswers.get(i)){
                return true;
            }
        }
        return false;
    }
}
