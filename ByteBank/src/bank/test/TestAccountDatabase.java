package test;

import models.Account;
import models.AccountDatabase;
import models.CheckingAccount;
import models.SavingsAccount;

public class TestAccountDatabase {

    public static void main(String[] args) {
        AccountDatabase database = new AccountDatabase();
        
        Account cc = new CheckingAccount(321, 159);
        database.add(cc);

        Account sc = new SavingsAccount(321, 357);
        database.add(sc);

        int numberOfAccounts = database.getNumberOfAccounts();
        System.out.println("Number of accounts: " + numberOfAccounts);

        Account refAccount = database.getReference(0);
        System.out.println(refAccount);

        Account refAccount2 = database.getReference(1);
        System.out.println(refAccount2);
    }
    
}
