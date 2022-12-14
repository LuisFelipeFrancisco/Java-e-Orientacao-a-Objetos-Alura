package test;
import models.CheckingAccount;
import models.InsufficientBalanceException;
import models.SavingsAccount;

public class TestAccounts {

    public static void main(String[] args) {

        CheckingAccount ca = new CheckingAccount(222, 333);
        ca.deposit(100.0);
        System.out.println("Checking account balance: " + ca.getBalance());

        SavingsAccount cs = new SavingsAccount(222, 444);
        cs.deposit(200.0);
        System.out.println("Savings account balance: " + cs.getBalance());

        try {
            ca.transfer(10, cs);
        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance");
        }
        System.out.println("Transferring 10 from checking to savings");

        System.out.println("Checking account balance: " + ca.getBalance());
        System.out.println("Savings account balance: " + cs.getBalance());

        System.out.println(ca);
        System.out.println(cs);
    }
    
}