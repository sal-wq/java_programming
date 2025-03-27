package Homework.bankingSoftware;

import Homework.bankingSoftware.abstraction.BankingService;
import Homework.bankingSoftware.model.Account;

public class Application {
    public static void main(String[] args) {
        Account S_Account = new Account("Saving Account");

        S_Account.K_deposit(200000);
        S_Account.D_deposit(20.00);
        S_Account.D_withdraw(15.00);
        S_Account.K_withdraw(80000);
        S_Account.convertFromDollarToRiel(5.00);
        S_Account.convertFromRielToDollar(20000.00);
        S_Account.showBalance();

        BankingService m = new Account("Credit Card");
        m.K_deposit(120000);
        m.D_deposit(20.00);
        m.D_withdraw(15.00);
        m.K_withdraw(80000);
        m.convertFromDollarToRiel(5.00);
        m.convertFromRielToDollar(20000.00);
        m.showBalance();

        Account creditCardAccount = new Account("CreditCard");
        creditCardAccount.showBalance();
    }
}