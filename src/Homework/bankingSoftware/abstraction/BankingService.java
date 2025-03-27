package Homework.bankingSoftware.abstraction;

public interface BankingService {
    void K_deposit(int deposit);
    void D_deposit(Double deposit);
    void K_withdraw(int cashAmount);
    void D_withdraw(Double cashAmount);
    void showBalance();
    void convertFromDollarToRiel(Double dollar);
    void convertFromRielToDollar(Double riel);
}