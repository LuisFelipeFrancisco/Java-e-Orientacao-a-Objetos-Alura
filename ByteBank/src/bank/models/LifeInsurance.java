package models;

public class LifeInsurance implements Taxable {

    @Override
    public double getTaxValue() {
        return 60;
    }

}