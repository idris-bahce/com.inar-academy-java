package chapters.chapter10.exercises.Exercise10_07;

import chapters.chapter09.exercises.Exercise9_07.Account;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int choice = 0;
        Scanner in = new Scanner(System.in);
        Account account = new Account(1996,100);
        System.out.println("Enter your id:");
        int id = in.nextInt();
        while (id != account.getId()){
            System.out.println("Wrong id! Try again...");
            id = in.nextInt();
        }
        if (id == account.getId()){
            while (choice!=4){
                System.out.println("Main menu" +
                        "\n1: check balance" +
                        "\n2: withdraw" +
                        "\n3: deposit" +
                        "\n4: exit");
                System.out.print("Enter a choice:");
                choice = in.nextInt();
                while (choice<1&&choice>4){
                    System.out.println("Invalid input! Try again.");
                    choice = in.nextInt();
                }
                switch (choice){
                    case 1:
                        System.out.println("\nThe balance is " + account.getBalance());
                        break;
                    case 2:
                        System.out.println("\nEnter an amount to withdraw: " );
                        double withdraw = in.nextDouble();
                        account.withdraw(withdraw);
                        break;
                    case 3:
                        System.out.println("\nEnter an amount to deposit: ");
                        double deposit = in.nextDouble();
                        account.deposit(deposit);
                        break;
                    case 4:
                        System.out.println("Goodbye...");
                        break;
                }
            }
        }
    }
}
