package Homework.bankingSoftware.model;

import Homework.bankingSoftware.abstraction.BankingService;

public class Account implements BankingService {
    private String accountName;
    private int khmer = 0;
    private double balance = 0.0;

    public Account(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public void K_deposit(int deposit) {
        if (deposit < 0) {
            System.out.println("Invalid amount of cash!");
            return;
        }
        khmer += deposit;
        System.out.println(accountName);
        System.out.println("Khmer money added: " + deposit + "៛");
        System.out.println("Deposit successful!");
        showBalance();
    }

    @Override
    public void D_deposit(Double deposit) {
        if (deposit < 0) {
            System.out.println("Invalid amount of cash!");
            return;
        }
        balance += deposit;
        System.out.println(accountName);
        System.out.println("Dollar money added: $" + deposit);
        System.out.println("Deposit successful!");
        showBalance();
    }

    @Override
    public void K_withdraw(int cashAmount) {
        if (cashAmount > khmer) {
            System.out.println("Cannot withdraw, insufficient Khmer balance: " + khmer + "៛");
            return;
        }
        khmer -= cashAmount;
        System.out.println(accountName);
        System.out.println("Withdraw successful: " + cashAmount + "៛");
        showBalance();
    }

    @Override
    public void D_withdraw(Double cashAmount) {
        if (cashAmount > balance) {
            System.out.println("Cannot withdraw, insufficient dollar balance: $" + balance);
            return;
        }
        balance -= cashAmount;
        System.out.println(accountName);
        System.out.println("Withdraw successful: $" + cashAmount);
        showBalance();
    }

    @Override
    public void showBalance() {
        System.out.println(accountName + " Balance:");
        System.out.println("Khmer: " + khmer + "៛");
        System.out.println("Dollar: $" + balance);
        System.out.println("=".repeat(50));
    }

    @Override
    public void convertFromDollarToRiel(Double dollar) {
        double convertedAmount = dollar * 4000;
        if (dollar > balance) {
            System.out.println("Insufficient dollar balance to convert!");
            return;
        }
        balance -= dollar;
        khmer += convertedAmount;
        System.out.println("Converted $" + dollar + " to " + convertedAmount + "៛");
        showBalance();
    }

    @Override
    public void convertFromRielToDollar(Double riel) {
        double convertedAmount = riel / 4000;
        if (riel > khmer) {
            System.out.println("Insufficient Khmer balance to convert!");
            return;
        }
        khmer -= riel;
        balance += convertedAmount;
        System.out.println("Converted " + riel + "៛ to $" + convertedAmount);
        showBalance();
    }
}
