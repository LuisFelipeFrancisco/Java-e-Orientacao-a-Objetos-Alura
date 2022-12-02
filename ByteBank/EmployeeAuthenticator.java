
public abstract class EmployeeAuthenticator extends Employee {

    private int password;

    public int setPassword(int password) {
        return this.password = password;
    }

    public boolean authenticate(int password) {
        if (this.password == password) {
            return true;
        } else {
            return false;
        }
    }

}
