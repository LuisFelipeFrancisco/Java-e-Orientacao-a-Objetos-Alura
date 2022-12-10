package models;

/**
 * This class represents an account in a bank.
 * 
 * @author LuisFelipeFrancisco
 * @version 1.0.0
 * @since 1.0.0
 */
public abstract class Account {

	protected double balance;
	private int agency;
	private int number;
	public Holder holder;
	private static int total = 0;

	public Account(int agency, int number) { // Constructor
		Account.total++;
		this.agency = agency;
		this.number = number;
		System.out.println("Creating an account...");
	}

	/**
	 * This function takes a double value and deposits it into the account.
	 * 
	 * @param value The amount of money to deposit.
	 */
	public abstract void deposit(double value); // Abstract method

	/**
	 * If the balance is less than the value, throw an InsufficientBalanceException with the message
	 * "Insufficient balance".
	 * 
	 * @param value The amount to be withdrawn
	 */
	public void withdraw(double value) throws InsufficientBalanceException { // Concrete method
		if (this.balance < value) {
			throw new InsufficientBalanceException("Insufficient balance");
		}
		this.balance -= value;
	}

	/**
	 * This function returns the balance of the account
	 * 
	 * @return The balance of the account.
	 */
	public double getBalance() {
		return this.balance;
	}

	/**
	 * This function transfers a value from this account to the destination account.
	 * 
	 * @param value The amount of money to be transferred.
	 * @param destination The account to which the money will be transferred.
	 */
	public void transfer(double value, Account destination) throws InsufficientBalanceException {
		this.withdraw(value);
		destination.deposit(value);
	}

	/**
	 * This function returns the agency of the account
	 * 
	 * @return The agency number.
	 */
	public int getAgency() {
		return this.agency;
	}

	/**
	 * This function returns the number of the account
	 * 
	 * @return The number of the account.
	 */
	public int getNumber() {
		return this.number;
	}

	/**
	 * This function sets the holder of the account.
	 * 
	 * @param holder The holder object that will be used to hold the data.
	 */
	public void setHolder(Holder holder) {
		this.holder = holder;
	}

	/**
	 * This function returns the value of the static variable total
	 * 
	 * @return The total number of accounts.
	 */
	public static int getTotal() {
		return Account.total;
	}

	/**
	 * The toString() method returns a string representation of the object
	 * 
	 * @return The agency, number, and balance of the account.
	 */
	public String toString() {
		return "Agency: " + this.agency + ", Number: " + this.number + ", Balance: " + this.balance;
	}

}

/*
 * Creating a new object of the class Account.
 * A Class is a blueprint of an object.
 * Abstract classes can't be instantiated.
 * Abstract classes can have abstract methods.
 * Abstract methods must be implemented in the subclasses.
 * Attributes are the characteristics of an object.
 * Methods are actions that an object can perform.
 * Parameters are values that are passed to the method.
 * The keyword this is a reference to the object itself.
 * void is a return type that means that the method does not return anything.
 * boolean is a return type that means that the method returns a boolean value.
 * (true or false)
 * The keyword static is used to make a variable or method accessible without
 * creating an object.
 * double is a return type that means that the method returns a double value.
 * Encapsulation is the process of hiding the implementation details of a class
 * from the user. (public, private, protected)
 * Getters are methods that allow us to access the attributes of an object.
 * Setters are methods that allow us to change the attributes of an object.
 * Refactoring is the process of changing the code without changing its
 * behavior.
 * Anemic model is a model that has only attributes and no methods.
 * Constructors are methods that are called when an object is instantiated.
 */