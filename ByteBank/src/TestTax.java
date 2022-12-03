
public class TestTax {
    
    public static void main(String[] args) {
            
            Tax tax = new Tax();
            
            CheckingAccount ca = new CheckingAccount(123, 456);
            ca.deposit(100);
                        
            LifeInsurance li = new LifeInsurance();
            
            tax.register(ca);
            tax.register(li);
            
            System.out.println("Total tax: " + tax.getTaxTotal());
            
    }
    
}