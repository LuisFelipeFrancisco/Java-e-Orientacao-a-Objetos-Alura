public class Mananger extends Employee {

    private int password;

    public boolean authenticate(int password) {
        if (this.password == password) {
            System.out.println("Access Granted");
            return true;
        } else {
            System.out.println("Access Denied");
            return false;
        }
    }

    public int setPassword(int password) {
        return this.password = password;
    }

    public double getBonus() {
        return super.getBonus() + super.getSalary();
    }

}

/*
 * extends keyword is used to inherit a class
 * super keyword is used to call the parent class constructor
 */
