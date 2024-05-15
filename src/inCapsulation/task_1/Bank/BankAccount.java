package inCapsulation.task_1.Bank;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private static int accGenerat = 0;

    public BankAccount() {
        this.accountNumber = accGenerat++;
        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void setTopUpBalance(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void setWithdrawBalance(int amount) {
        if (amount < 0 && balance >= -amount) {
            balance += amount;
        }
    }
}
