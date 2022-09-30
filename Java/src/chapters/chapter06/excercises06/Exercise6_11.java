package chapters.chapter06.excercises06;

public class Exercise6_11 {
    public static void main(String[] args) {
        System.out.println("Sales Amount \t Commission");
        System.out.println("------------------------------");
        for (int i = 10000; i <= 100000; i+=5000) {
            System.out.printf("%6d %16.1f",i,computeCommission(i));
            System.out.println();
        }
    }
    public static double computeCommission(int amount){
        final double baseSalary = 5000 ;
        final double requiredSell = 30_000 - baseSalary ;

        for(double commission= 0 ; commission <= requiredSell ; commission++){
            if(amount >= 10000){
                commission =  (amount-10000) * 0.12 + 5_000 * 0.10 + 5_000 * 0.08 ;
                return commission;
            }
            else if (amount >= 5000 ){
                commission = (amount - 5000) * 0.10 + 5000 * 0.08 ;
                return commission;
            }else {
                commission = amount * 0.08 ;
                return commission;
            }
        }
        return 0;
    }
}
