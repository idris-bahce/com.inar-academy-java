package chapters.chapter07.listings;

public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        initialiseTheCards(deck);
        getShuffledCards(deck);
        displayTheFirstFourCards(getShuffledCards(deck), suits, ranks);

    }

    public static void displayTheFirstFourCards(int[] deck,String[] suits, String[] ranks) {
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }

    }

    public static void initialiseTheCards(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
    }

    public static int[] getShuffledCards(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int random = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[random];
            deck[random]= temp;
        }
        return deck;
    }
}
