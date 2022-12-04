package models;

public class Tax {
    
    private double taxTotal;

    public void register(Taxable tx){
        double value = tx.getTaxValue();
        this.taxTotal += value;
    }

    public double getTaxTotal() {
        return taxTotal;
    }

}