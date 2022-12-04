package models;

public class Auth {

    private int password;

    public void setPassword(int password) {
        this.password = password;
    }

    public boolean authenticate(int password) {
        return !(this.password != password);
    }
    
}

/*
 * Composition is a way to reuse code
 */