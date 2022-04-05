import java.util.*;
public class BankAccountTest{
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();

        account1.makeDeposit("checking", 1000.00);
        account1.makeWithdraw("checking", 10.00);
        account1.makeDeposit("savings", 3500.00);
        account1.makeWithdraw("savings", 500.00);

        account1.getCheckingBalance();
        account1.getSavingsBalance();
        account1.getAccountTotal();
}
}