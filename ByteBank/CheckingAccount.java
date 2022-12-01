
public class CheckingAccount extends Account {

    public CheckingAccount(int agency, int number) {
        super(agency, number);
    } 

}


//Constructors are not inherited, so we need to create a constructor for CheckingAccount.
//We can use the super() method to call the constructor of the superclass.
//The super() method must be the first line of the constructor.
