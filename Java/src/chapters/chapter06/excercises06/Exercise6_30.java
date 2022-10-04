package chapters.chapter06.excercises06;

public class Exercise6_30 {
    public static void main(String[] args) {
        int counter = 0;
        while (counter == 0) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            int sum = dice1 + dice2;
            System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
            if (isCraps(sum)) {
                System.out.println(" Craps! You are a LOSER!");
                counter--;
            } else if (isNatural(sum)) {
                System.out.println(" Natural! You are a WINNER!");
                counter--;
            } else {
               int sum2 = 0;
               while (sum2 != 7 && sum2 != sum){
                   dice1 = (int) (Math.random() * 6) + 1;
                   dice2 = (int) (Math.random() * 6) + 1;
                   sum2 = dice2 + dice1;
                   if (sum2 == sum){
                       System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum2 + " You are a WINNER!");
                       counter++;
                   }else if (sum2 == 7){
                       System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum2 + " You are a LOSER!");
                       counter++;
                   }
               }
            }
        }
    }

    public static boolean isNatural(int sum) {
        if (sum == 7 || sum == 11) {
            return true;
        } else
            return false;
    }

    public static boolean isCraps(int sum) {
        if (sum == 2 || sum == 3 || sum == 12) {
            return true;
        } else
            return false;
    }
}
