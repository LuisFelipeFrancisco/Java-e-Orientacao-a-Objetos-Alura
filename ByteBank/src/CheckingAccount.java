
public class CheckingAccount extends Account implements Taxable {

    public CheckingAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void deposit(double value) {
        super.balance += value;
    }

    @Override
    public boolean withdraw(double value) {
        double valueToWithdraw = value + 0.2;
        return super.withdraw(valueToWithdraw);
    }

    @Override
    public double getTaxValue() {
        return super.getBalance() * 0.01;
    }

}

/*
 * Constructors are not inherited, so we need to create a constructor for CheckingAccount.
 * We can use the super() method to call the constructor of the superclass.
 * The super() method must be the first line of the constructor.
 * @Override is an annotation that tells the compiler that we are overriding a method.
 */