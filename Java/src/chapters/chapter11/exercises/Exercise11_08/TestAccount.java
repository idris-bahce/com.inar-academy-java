package chapters.chapter11.exercises.Exercise11_08;

public class TestAccount {
    public static void main(String[] args) {
        Account1 a1 = new Account1("George" , 1122, 1000);
        a1.setAnnualInterestRate(1.5);
        a1.deposit(30);
        a1.deposit(40);
        a1.deposit(50);

        a1.withdraw(5);
        a1.withdraw(4);
        a1.withdraw(2);
        System.out.println(a1);
    }
}
