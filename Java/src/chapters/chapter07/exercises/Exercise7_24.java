package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_24 {
    public static void main(String[] args) {

        int[] arrOfFourPickedCards = new int[4];
        int counterOfPicks = 0;
        while (!(arrOfFourPickedCards[0] / 13 == 0 && arrOfFourPickedCards[1] / 13 == 1 && arrOfFourPickedCards[2] / 13 == 2
                && arrOfFourPickedCards[3] / 13 == 3)) {
            for (int i = 0; i < 4; i++) {
                int random = (int) (Math.random() * 52);
                arrOfFourPickedCards[i] = random;
            }
            counterOfPicks++;
        }
        printTheCards(arrOfFourPickedCards);
        System.out.println("Number of picks: " + counterOfPicks);


    }

    private static void printTheCards(int[] arrOfFourPickedCards) {

        String[] suits = {"Spades", "Heart", "Diamonds", "Clubs"};
        String[] ranks = {"King", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen"};
        for (int i = 0; i < arrOfFourPickedCards.length; i++) {
            System.out.println(suits[arrOfFourPickedCards[i]/13] + " of " + ranks[arrOfFourPickedCards[i] % 13]);
        }
    }
}
