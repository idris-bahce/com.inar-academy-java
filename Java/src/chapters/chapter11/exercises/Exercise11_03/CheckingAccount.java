package chapters.chapter11.exercises.Exercise11_03;

import chapters.chapter09.exercises.Exercise9_07.Account;

public class CheckingAccount extends Account {
    private int overdrawLimit;

    public CheckingAccount() {
        overdrawLimit = 1000;
    }

    public CheckingAccount(int id, double balance, int overdrawLimit) {
        super(id, balance);
        this.overdrawLimit = overdrawLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 0 - overdrawLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("You can not withdraw money!");
        }
    }

    @Override
    public String toString() {
        return "Balance: " + getBalance()
                + "\nMonthly interest: " + getMonthlyInterestRate()
                + "\nDate of creation: " + getDateCreated();
    }
}
