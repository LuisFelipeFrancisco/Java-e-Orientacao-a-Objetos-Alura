
public class Account {
	private double balance;
	private int agency;
	private int number;
	Holder holder;
	private static int total;

	public Account(int agency, int number) {
		Account.total++;
		this.agency = agency;
		this.number = number;
		System.out.println("Creating an account...");
	}

	public void deposit(double value) {
		this.balance += value;
	}

	public void withdraw(double value) {
		if (value > 0) {
			this.balance -= value;
		}
	}

	public double getBalance() {
		return this.balance;
	}

	public boolean transfer(double value, Account destination) {
		if (this.balance >= value) {
			this.balance -= value;
			// destination.balance += value;
			destination.deposit(value); // Using the deposit method.
			return true;
		} else {
			return false;
		}
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
 * Atributes are the characteristics of an object.
 * Methods are actions that an object can perform.
 * Parameters are values that are passed to the method.
 * The keyword this is a reference to the object itself.
 * void is a return type that means that the method does not return anything.
 * boolean is a return type that means that the method returns a boolean value.
 * (true or false)
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