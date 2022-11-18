package chapters.chapter11.exercises.Exercise11_08;

import java.util.ArrayList;
import java.util.Date;

public class Account1 {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;

    public Account1(int id, double balance) {
        this(null, id, balance);
        dateCreated = new Date();
    }

    public Account1(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }

    public double getMonthlyInterestRate() {
        return getAnnualInterestRate() / 1200;
    }

    public void withdraw(double withdrawAmount){
        Transaction t = new Transaction('W',withdrawAmount,balance,"");
        setBalance(getBalance() - withdrawAmount);
        transactions.add(t);
    }

    public void deposit(double depositAmount){
        Transaction t = new Transaction('D',depositAmount,balance,"");
        setBalance(getBalance() + depositAmount);
        transactions.add(t);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < transactions.size(); i++) {
            sb.append(transactions.get(i));
        }
        return "name: " + name + "\nbalance: " + getBalance() +
                "\nmonthly interest: " + getMonthlyInterestRate() +
                "\ndate created: " + getDateCreated() +
                "\ntransactions: \n" + sb;
    }
}
