
public class Admistrator extends EmployeeAuthenticator {


    @Override
    public double getBonus() {
        return super.getSalary() * 0.5;
    }

}

/*
 * extends keyword is used to inherit a class
 * super keyword is used to call the parent class constructor
 */
