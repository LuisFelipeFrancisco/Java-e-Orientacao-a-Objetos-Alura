
public class CreateAccount {

	public static void main(String[] args) {

		Account firstAccount = new Account(123, 123456);
		Holder holder = new Holder();
		holder.setName("Felipe");
		holder.setCpf("123.456.789-00");
		holder.setProfession("Developer");

		firstAccount.deposit(200);
		firstAccount.getBalance();

		firstAccount.deposit(100);
		firstAccount.getBalance();

		System.out.println("--------------------");
		System.out.println("Account Agency: "+ firstAccount.getAgency());
		System.out.println("Account Number: "+ firstAccount.getNumber());
		firstAccount.setHolder(holder);
		System.out.println("Account Holder: "+ firstAccount.holder.getName());
		System.out.println("Account Balance: "+ firstAccount.getBalance());
		System.out.println("--------------------");
	}

}
/*
 * Creating a new object of the class Account.
 * Instantiating an object of the class Account.
 * Accesing this object through the variable.
 * 
 * An object is an instance of a class.
 * I can create as many objects as i want from a class.
 * Each object has its own memory space.
 * Each object has its own attributes.
 */