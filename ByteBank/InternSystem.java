
public class InternSystem {

    private int password = 5555;

    public void authenticate (EmployeeAuthenticator e){
        boolean authenticate = e.authenticate(this.password);
        if (authenticate) {
            System.out.println("Welcome to the system");
        } else {
            System.out.println("Access denied");
        }
    }
    
}
