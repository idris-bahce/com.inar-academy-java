package chapters.chapter09.exercises.Exercise9_07;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122,20_000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("The balance is: "+account.getBalance());
        System.out.println("The monthly interest is: " + account.getMonthlyInterestRate());
        System.out.println("Date is: " + account.getDateCreated());
    }
}
