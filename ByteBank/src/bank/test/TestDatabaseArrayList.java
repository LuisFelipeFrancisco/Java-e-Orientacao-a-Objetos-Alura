package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import models.Account;
import models.CheckingAccount;
import models.Holder;
import models.SavingsAccount;

public class TestDatabaseArrayList {
    public static void main(String[] args) {
        
        ArrayList<Account> database = new ArrayList<Account>();

        Account cc1 = new CheckingAccount(123, 0003);
        Holder holder = new Holder();
        holder.setName("Luis");
        cc1.setHolder(holder);
        cc1.deposit(3000);
        database.add(cc1);

        Account cc2 = new CheckingAccount(123, 0001);
        holder = new Holder();
        holder.setName("Felipe");
        cc2.setHolder(holder);
        cc2.deposit(1500);
        database.add(cc2);

        Account sc1 = new SavingsAccount(123, 0002);
        holder = new Holder();
        holder.setName("Maria");
        sc1.setHolder(holder);
        sc1.deposit(1000);
        database.add(sc1);

        Account sc2 = new SavingsAccount(123, 0004);
        holder = new Holder();
        holder.setName("John");
        sc2.setHolder(holder);
        sc2.deposit(3000);
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

        System.out.println("Sorting by number...");
        database.sort(new AccountNumberComparator());
        for (Account account : database) {
            System.out.println(account);
        }

        System.out.println("Sorting by Holder...");
        Comparator<Account> comparator = (c1, c2) -> {
            String name1 = c1.holder.getName();
            String name2 = c1.holder.getName();
            return name1.compareTo(name2);
        };
        database.sort(comparator);
        database.forEach( (account) -> System.out.println(account + " Holder: " + account.holder.getName()) );

        System.out.println("Sorting by Balance...");
        database.sort(new Comparator<Account>() {
            @Override
            public int compare(Account c1, Account c2) {
                return Double.compare(c1.getBalance(), c2.getBalance());
            }
        });
        for (Account account : database) {
            System.out.println(account);
        }

        Collections.sort(database, new Comparator<Account>() {
            @Override
            public int compare(Account c1, Account c2) {
                return Integer.compare(c1.getNumber(), c2.getNumber());
            }
        });
    }

}

class AccountNumberComparator implements Comparator<Account> {

    @Override
    public int compare(Account c1, Account c2) {
        return Integer.compare(c1.getNumber(), c2.getNumber());
    }

}
