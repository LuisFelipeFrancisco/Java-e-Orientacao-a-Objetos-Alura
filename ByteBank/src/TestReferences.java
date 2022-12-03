
public class TestReferences {

    public static void main(String[] args) {
        
        Manager manager = new Manager();
        manager.setName("Luis");
        manager.setSalary(5000.0); 

        Editor editor = new Editor();
        editor.setSalary(2500.0);

        Designer designer = new Designer();
        designer.setSalary(2000.0); 

        BonusControl bonusControl = new BonusControl(); 
        bonusControl.register(manager);
        System.out.println("Mananger Bonus: " + manager.getBonus());
        bonusControl.register(editor);
        System.out.println("Editor Bonus: " + editor.getBonus());
        bonusControl.register(designer);
        System.out.println("Designer Bonus: " + designer.getBonus());

        System.out.println("Total Bonus: " + bonusControl.getTotalBonus());

    }
    
}