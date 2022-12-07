package especial;

import models.Account;

public class EspecialAccount extends Account {

    public EspecialAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void deposit(double value) {
        this.balance += value; // The attribute balance is protected in the superclass, so it can be accessed here.
    }
    
}

/*
 * Public: The class is visible everywhere.
 * <<Package private>>: The class is only visible in the package.   (default)
 * Protected: The class is visible in the package and in the subclasses.
 * Private: The class is only visible in the class.
 * Access modifiers can be applied to classes, attributes, methods and constructors.
 */ 