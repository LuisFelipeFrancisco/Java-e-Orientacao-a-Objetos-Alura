import models.Account;
import models.CheckingAccount;

public class TestLib {
    public static void main(String[] args) throws Exception {
        
        Account account = new CheckingAccount(1122, 20000);

        account.deposit(1500);

        System.out.println("Balance: " + account.getBalance());
    }
}


/*
 * Library are a collection of classes and interfaces
 * they are used to create reusable code
 */