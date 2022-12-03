
public class InternSystem {

    private int password = 5555;

    public void authenticate(Authenticator auth) {

        boolean authenticate = auth.authenticate(this.password);

        if (authenticate) {
            System.out.println("Access granted");
        } else {
            System.out.println("Password incorrect, access denied");
        }
    }

}