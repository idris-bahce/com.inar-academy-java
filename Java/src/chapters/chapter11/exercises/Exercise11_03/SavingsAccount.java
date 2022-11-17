package chapters.chapter11.exercises.Exercise11_03;

import chapters.chapter09.exercises.Exercise9_07.Account;

public class SavingsAccount extends Account {
    public SavingsAccount() {
    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount){
        if ((getBalance() - amount) >= 0){
            setBalance(getBalance() - amount);
        }else {
            System.out.println("You don't have $" + amount + " in your account");
        }
    }

    @Override
    public String toString() {
        return "Balance: " + getBalance()
                + "\nMonthly interest: " + getMonthlyInterestRate()
                + "\nDate of creation: " + getDateCreated();
    }
}
