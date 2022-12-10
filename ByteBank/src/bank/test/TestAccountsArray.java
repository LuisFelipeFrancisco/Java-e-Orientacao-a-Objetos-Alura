package test;
import models.Account;
import models.CheckingAccount;
import models.SavingsAccount;

public class TestAccountsArray {
    
    public static void main(String[] args) {
        
        CheckingAccount[] accounts = new CheckingAccount[5];
        
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new CheckingAccount(222, i);
            accounts[i].deposit(i * 100);
        }
        
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i]);
        }

        Account[] acc = new Account[2];

        acc[0] = new CheckingAccount(333, 1);
        acc[1] = new SavingsAccount(444, 2);
        
        for (int i = 0; i < acc.length; i++) {
            System.out.println(acc[i]);
        }

        CheckingAccount refAccount = (CheckingAccount) acc[0];
        System.out.println(refAccount);
                
    }
}
