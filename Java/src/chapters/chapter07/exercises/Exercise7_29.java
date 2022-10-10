package chapters.chapter07.exercises;
//Unfinished
public class Exercise7_29 {
    public static void main(String[] args) {
        int[] pickFourCards = getFourCards();
        int[] spades = getTheSpades();
        int[] clubs = getTheClubs();
        int[] hearts = getTheHearts();
        int[] diamonds = getTheDiamonds();

        displayTheSum(pickFourCards,spades,clubs,hearts,diamonds);
    }

    public static void displayTheSum(int[] pickFourCards, int[] spades, int[] clubs, int[] hearts, int[] diamonds) {
        int sum = 0;
        while (sum != 24){
            sum = spades[pickFourCards[0]] + clubs[pickFourCards[1]] + hearts[pickFourCards[2]] + diamonds[pickFourCards[3]];
        }
    }

    public static int[] getFourCards() {
        int[] arr = new int[4];
        int index = 0;
        int counter = 0;
        while (counter<4){
            int random = (int) (Math.random() * 52);
            if (arr[index] != random){
                arr[index] = random;
                index++;
                counter++;
            }
        }
        return arr;
    }

    public static int[] getTheDiamonds() {
        int[] arr = new int[13];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static int[] getTheHearts() {
        int[] arr = new int[13];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static int[] getTheClubs() {
        int[] arr = new int[13];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static int[] getTheSpades() {
        int[] arr = new int[13];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

}
