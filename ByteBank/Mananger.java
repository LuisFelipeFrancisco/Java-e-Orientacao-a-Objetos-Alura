public class Mananger extends Employee {
    
    private int password;

    public boolean authenticate(int password) {
        if (this.password == password) {
            System.out.println("Access granted");
            return true;
        } else {
            System.out.println("Access denied");
            return false;
        }
    }

    public int setPassword(int password) {
        return this.password = password;
    }

}

/*
 * extends keyword is used to inherit a class
 */
