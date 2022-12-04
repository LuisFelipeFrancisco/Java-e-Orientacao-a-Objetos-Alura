
public class TestInsufficientBalanceException {

    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(123, 123456);
        savingsAccount.deposit(200);

        try {
            savingsAccount.withdraw(210);
        } catch (InsufficientBalanceException e) {
            System.out.println("Current balance: " + savingsAccount.getBalance());
            e.printStackTrace(); // Prints the stack trace of the exception.
        }
    }

}
