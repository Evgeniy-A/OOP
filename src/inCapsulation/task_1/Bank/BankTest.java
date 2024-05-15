package inCapsulation.task_1.Bank;

import inCapsulation.task_1.Bank.BankAccount;

public class BankTest {
   public static void main(String[] args) {
       BankAccount account = new BankAccount();


       account.setTopUpBalance(50);
      System.out.println(account.getBalance());
     account.setWithdrawBalance(-100);
     System.out.println(account.getBalance());
   }
}
