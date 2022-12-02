
public class Admistrator extends Employee implements Authenticator {

    private int password;

    @Override
    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public boolean authenticate(int password) {
        return !(this.password != password);
    }

    @Override
    public double getBonus() {
        return super.getSalary() * 0.5;
    }

}

/*
 * extends keyword is used to inherit a class
 * super keyword is used to call the parent class constructor
 */
