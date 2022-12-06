package models;

public class BonusControl {

    private double totalBonus = 0;
    
    public void register(Employee employee) {
        this.totalBonus += employee.getBonus();
    }

    public double getTotalBonus() {
        return totalBonus;
    }
    
}