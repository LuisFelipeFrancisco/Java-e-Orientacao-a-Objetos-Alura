
public class TestAccounts {

    public static void main(String[] args) {

        CheckingAccount ca = new CheckingAccount(222, 333);
        ca.deposit(100.0);
        System.out.println("Checking account balance: " + ca.getBalance());

        SavingsAccount cs = new SavingsAccount(222, 444);
        cs.deposit(200.0);
        System.out.println("Savings account balance: " + cs.getBalance());

        ca.transfer(10, cs);
        System.out.println("Transfering 10 from checking to savings");

        System.out.println("Checking account balance: " + ca.getBalance());
        System.out.println("Savings account balance: " + cs.getBalance());
    }
    
}