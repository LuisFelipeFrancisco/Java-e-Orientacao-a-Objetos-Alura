
public class Client implements Authenticator {

    private int password;

    @Override
    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public boolean authenticate(int password) {
        return !(this.password != password);
    }
    
}
