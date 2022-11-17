package chapters.chapter11.exercises.Exercise11_03;


public class Test {
    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount(456, 872.20, 100);
        SavingsAccount s = new SavingsAccount(789, 232.54);

        System.out.println(c.toString());
        System.out.println("----------------");
        System.out.println(s.toString());
    }
}
