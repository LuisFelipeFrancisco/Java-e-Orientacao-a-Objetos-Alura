package test;

import java.util.ArrayList;

import models.Account;
import models.CheckingAccount;
import models.SavingsAccount;

public class TestDatabaseArrayList {
    public static void main(String[] args) {
        
        ArrayList<Account> database = new ArrayList<Account>();

        Account cc1 = new CheckingAccount(123, 123);
        database.add(cc1);

        Account cc2 = new CheckingAccount(123, 456);
        database.add(cc2);

        Account sc1 = new SavingsAccount(123, 789);
        database.add(sc1);

        Account sc2 = new SavingsAccount(123, 987);
        database.add(sc2);

        System.out.println("Number of elements: " + database.size());

        Account reference = database.get(0);
        System.out.println(reference.getNumber());

        for (int i = 0; i < database.size(); i++) {
            Object ref = database.get(i);
            System.out.println(ref);
        }

        database.remove(3);
        System.out.println("Number of elements: " + database.size());

        for (Account account : database) {
            System.out.println(account);
        }

        Account cc3 = new CheckingAccount(123, 123);
        
        boolean exists = database.contains(cc3);
        System.out.println("This account already exists? " + exists);

        for (Account account : database) {
            if (account.equals(cc3)) {
                System.out.println("This account already exists.");
            }
        }
    }

}
