import java.util.*;
public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numOfAccounts;
    private static double accountTotal;

    // Constructor
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numOfAccounts++;
    }

    //getters
    public void getCheckingBalance() {
        System.out.printf("Total checking balance: $%.2f\n ", this.checkingBalance);
    }

    public void getSavingsBalance() {
        System.out.printf("Total savings balance: $%.2f\n ", this.savingsBalance);
    }

    public void getAccountTotal() {
        getCheckingBalance();
        getSavingsBalance();
    }

    // make deposit
    public void makeDeposit(String account, double amount ) {
        if(account == "checking") {
            checkingBalance += amount;
            accountTotal += amount;
            System.out.printf("Successful deposit to checking account: $%.2f ", amount);
            getCheckingBalance();
        }
        else if(account == "savings") {
            savingsBalance += amount;
            accountTotal += amount;
            System.out.printf("Successful deposit to savings account: $%.2f ", amount);
            getSavingsBalance();
        }
        else {
            System.out.println("Error making deposit");
        }
    }

    // make withdraw
    public void makeWithdraw(String account, double amount ) {
        if(account == "checking") {
            if(checkingBalance < amount) {
                System.out.println("Unsuccesfull withdraw: insufficient funds");
            }
            else {
                checkingBalance -= amount;
                accountTotal -= amount;
                System.out.printf("Successful withdraw from checking account: $%.2f ", amount);
                getCheckingBalance();
            }
        }
        else if(account == "savings") {
            if(savingsBalance < amount) {
                System.out.println("Unsuccesfull withdraw: insufficient funds");
            }
            else {
                savingsBalance -= amount;
                accountTotal -= amount;
                System.out.printf("Successful withdraw from savings account: $%.2f ", amount);
                getSavingsBalance();
            }
        }
        else {
            System.out.println("Error making withdraw");
        }
    }
}