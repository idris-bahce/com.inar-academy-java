package chapters.chapter07.exercises;

public class Exercise7_29 {

    public static void main(String[] args) {

        int[] fourPick = getTheFourPick();
        printTheCards(fourPick);

    }

    private static void printTheCards(int[] fourPick) {
        int[] arrOfCards = getTheCards(fourPick);
        String[] suits = {"Spades", "Heart", "Diamonds", "Clubs"};
        String[] ranks = {"King", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen"};
        for (int i = 0; i < arrOfCards.length; i++) {
            System.out.println(suits[arrOfCards[i]] + " of " + ranks[fourPick[i] % 13]);
        }
    }

    private static int[] getTheCards(int[] fourPick) {
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = fourPick[i] / 13;
        }
        return arr;
    }

    private static int[] getTheFourPick() {
        int [] arr = new int[4];
        while (!isSumOfTheElements24(arr)) {
            for (int i = 0; i < 4; i++) {
                int random = (int) (Math.random() * 52);
                arr[i] = random;
            }
        }
        return arr;
    }

    private static boolean isSumOfTheElements24(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]%13;
        }
        if (sum==24){
            return true;
        }else
            return false;
    }
}
