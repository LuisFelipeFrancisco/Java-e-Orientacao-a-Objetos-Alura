package test;
import models.CheckingAccount;

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
                
    }
}
