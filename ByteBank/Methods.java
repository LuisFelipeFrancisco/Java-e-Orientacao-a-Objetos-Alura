public class Methods {
    
    public static void main(String[] args) {
        Account firstAccount = new Account(123, 123456);
        //firstAccount.balance = 200;
        firstAccount.deposit(200);
        //System.out.println(firstAccount.balance);
        System.out.println(firstAccount.getBalance());
        firstAccount.deposit(50);
        System.out.println(firstAccount.getBalance());
        //System.out.println(firstAccount.balance);        

    }
    
}
