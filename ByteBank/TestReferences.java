
public class TestReferences {

    public static void main(String[] args) {
        
        Mananger mananger = new Mananger();
        mananger.setName("Luis");
        mananger.setSalary(5000.0); //Bonus 6000.0 (5000.0 + 1000.0 - Salary + Bonus 0.2)

        Editor editor = new Editor();
        editor.setSalary(2500.0); //Bonus 150.0 (Fixed)

        Designer designer = new Designer();
        designer.setSalary(2000.0); //Bonus 200.0 (Fixed)

        BonusControl bonusControl = new BonusControl(); 
        bonusControl.register(mananger);
        bonusControl.register(editor);
        bonusControl.register(designer);

        System.out.println("Total Bonus: " + bonusControl.getTotalBonus()); //950.0

    }
    
}
