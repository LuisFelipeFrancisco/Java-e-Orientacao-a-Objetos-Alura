
public abstract interface Authenticator{

    public abstract void setPassword(int password);

    public abstract boolean authenticate(int password);

}

/*
 * abstract keyword is used to create an abstract class
 * interface keyword is used to create an interface
 * interface is a contract that must be implemented by the classes that implements it
 */
