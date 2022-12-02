
public class Manager extends Employee implements Authenticator {

    private int password;

    @Override
    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public boolean authenticate(int password) {
        return !(this.password != password);
    }

    public double getBonus() {
        return super.getSalary();
    }

}
/*
 * extends keyword is used to inherit a class
 * super keyword is used to call the parent class constructor
 */
