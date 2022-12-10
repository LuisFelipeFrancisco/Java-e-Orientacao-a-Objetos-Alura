package test;

import java.util.ArrayList;

import models.Account;
import models.CheckingAccount;
import models.SavingsAccount;

public class TestDatabase {
    public static void main(String[] args) {
        
        ArrayList database = new ArrayList();

        Account cc1 = new CheckingAccount(123, 123);
        database.add(cc1);

        Account cc2 = new CheckingAccount(123, 456);
        database.add(cc2);

        Account sc1 = new SavingsAccount(123, 789);
        database.add(sc1);

        Account sc2 = new SavingsAccount(123, 987);
        database.add(sc2);

        System.out.println("Number of elements: " + database.size());

        Account reference = (Account) database.get(0);
        System.out.println(reference.getNumber());

        for (int i = 0; i < database.size(); i++) {
            Object ref = database.get(i);
            System.out.println(ref);
        }

        database.remove(3);
        System.out.println("Number of elements: " + database.size());

        for (int i = 0; i < database.size(); i++) {
            Object ref = database.get(i);
            System.out.println(ref);
        }
    }

}
