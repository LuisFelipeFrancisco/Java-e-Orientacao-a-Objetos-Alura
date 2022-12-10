
package models;

public class AccountDatabase {
    
    private Account[] refAccounts;
    private int numberOfAccounts;

    public AccountDatabase() {
        this.refAccounts = new Account[10];
        this.numberOfAccounts = 0;
    }

    public void add(Account ref) {
        refAccounts[this.numberOfAccounts] = ref;
        this.numberOfAccounts++;
    }

    public int getNumberOfAccounts() {
        return this.numberOfAccounts;
    }

    public Account getReference(int position) {
        return this.refAccounts[position];
    }
    
}
