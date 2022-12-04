package models;

public interface Taxable {

    public abstract double getTaxValue();

}

/*
 * The interface Taxable has a method that returns the tax value.
 * The interface Taxable is implemented by the classes CheckingAccount and SavingsAccount.
 */