
public class Manager extends Employee implements Authenticator {

    private Auth auth;

    public Manager() {
        this.auth = new Auth();
    }

    @Override
    public void setPassword(int password) {
        this.auth.setPassword(password);
    }

    @Override
    public boolean authenticate(int password) {
        return this.auth.authenticate(password);
    }

    public double getBonus() {
        return super.getSalary();
    }

}

/*
 * extends keyword is used to inherit a class
 * super keyword is used to call the parent class constructor
 */
