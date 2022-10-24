package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_37 {
    public static void main(String[] args) {
        int question = 0;
        final int NUMBER_OF_QUESTION = 50;
        String[][] answers = array();
        int trueCounter = 0;
        while (question < NUMBER_OF_QUESTION) {
            System.out.print((question + 1) + ".");
            printTheQuestion(question, answers);
            String answer = getTheAnswer(question, answers);
            if (answer.toLowerCase().contains(answers[question][1].toLowerCase())) {
                trueCounter++;
            }
            question++;
        }
        System.out.println("The correct count is: " + trueCounter);
    }

    private static String getTheAnswer(int question, String[][] answers) {
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        return answer;
    }


    private static void printTheQuestion(int q, String[][] answers) {
        System.out.print("What is the capital of " + answers[q][0] + "?\n");

    }

    private static String[][] array() {
        String[][] question = {
                {"Arkansas", "Little Rock"}, {"Alabama", "Montgomery"}, {"Alaska", "Juneau"},
                {"California", "Sacramento"}, {"Arizona", "Phoenix"}, {"Colorado", "Denver"},
                {"Connecticut", "Hartford"}, {"Delaware", "Dover"}, {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"}, {"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
                {"Illinois", "Springfield"}, {"Indiana", "Indianapolis"}, {"Iowa", "Des Moines"},
                {"Kansas", "Topeka"}, {"Kentucky", "Frankfort"}, {"Louisiana", "Baton Rouge"},
                {"Maine", "Augusta"}, {"Maryland", "Annapolis"}, {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"}, {"Minnesota", "St. Paul"}, {"Mississippi", "Jackson"},
                {"Missouri", "Jefferson City"}, {"Montana", "Helena"}, {"Nebraska", "Lincoln"},
                {"Nevada", "Carson City"}, {"New Hampshire", "Concord"}, {"New Jersey", "Trenton"},
                {"New Mexico", "Santa Fe"}, {"New York", "Albany"}, {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"}, {"Ohio", "Columbus"}, {"Oklahoma", "Oklahoma City"},
                {"Oregon", "Salem"}, {"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"}, {"South Dakota", "Pierre"}, {"Tennessee", "Nashville"},
                {"Texas", "Austin"}, {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"}, {"Washington", "Olympia"}, {"West Virginia", "Charleston"},
                {"Wisconsin", "Madison"}, {"Wyoming", "Cheyenne"},};
        return question;
    }
}
