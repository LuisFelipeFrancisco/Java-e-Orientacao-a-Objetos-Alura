package models;

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

	public abstract void deposit(double value); // Abstract method

	public void withdraw(double value) throws InsufficientBalanceException { // Concrete method
		if (this.balance < value) {
			throw new InsufficientBalanceException("Insufficient balance");
		}
		this.balance -= value;
	}

	public double getBalance() {
		return this.balance;
	}

	public void transfer(double value, Account destination) throws InsufficientBalanceException {
		this.withdraw(value);
		destination.deposit(value);
	}

	public int getAgency() {
		return this.agency;
	}

	public int getNumber() {
		return this.number;
	}

	public void setHolder(Holder holder) {
		this.holder = holder;
	}

	public static int getTotal() {
		return Account.total;
	}

}

/*
 * Creating a new object of the class Account.
 * A Class is a blueprint of an object.
 * Abstract classes can't be instantiated.
 * Abstract classes can have abstract methods.
 * Abstract methods must be implemented in the subclasses.
 * Atributes are the characteristics of an object.
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