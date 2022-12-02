
public class Test {
    
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(123, 123456);

        Holder holder = new Holder();
        holder.setName("Felipe");
        holder.setCpf("123.456.789-00");
        holder.setProfession("Developer");

        account.setHolder(holder);
        account.deposit(200);

        System.out.println("Account Agency: "+ account.getAgency());
        System.out.println("Account Number: "+ account.getNumber());
        System.out.println("Account Holder: "+ account.holder.getName());
        System.out.println("Account Balance: "+ account.getBalance());
        account.withdraw(50);
        System.out.println("Account Balance: "+ account.getBalance());
        System.out.println("--------------------");

        CheckingAccount account2 = new CheckingAccount(123, 654321);
        Holder holder2 = new Holder();
        holder2.setName("Luis");
        holder2.setCpf("456.789.123-00");
        holder2.setProfession("Web Developer");

        account2.setHolder(holder2);
        account2.deposit(100);

        System.out.println("Account Agency: "+ account2.getAgency());
        System.out.println("Account Number: "+ account2.getNumber());
        System.out.println("Account Holder: "+ account2.holder.getName());
        System.out.println("Account Balance: "+ account2.getBalance());
        account2.deposit(250);
        System.out.println("Account Balance: "+ account2.getBalance());
        System.out.println("--------------------");

        System.out.println("Number of accounts: "+ Account.getTotal());

    }
    
}