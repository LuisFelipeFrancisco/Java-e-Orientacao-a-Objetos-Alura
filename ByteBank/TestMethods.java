
public class TestMethods {
    
    public static void main(String[] args) {
        CheckingAccount firstAccount = new CheckingAccount(123, 123456);
        //firstAccount.balance = 200;
        firstAccount.deposit(200);
        //System.out.println(firstAccount.balance);
        System.out.println(firstAccount.getBalance());
        firstAccount.deposit(50);
        System.out.println(firstAccount.getBalance());
        //System.out.println(firstAccount.balance);        

    }
    
}