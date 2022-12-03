
public class Client implements Authenticator {

    private Auth auth;

    public Client() {
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
    
}