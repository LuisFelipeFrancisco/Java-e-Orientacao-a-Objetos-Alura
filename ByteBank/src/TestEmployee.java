
public class TestEmployee {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("Luis");
        manager.setCpf("987.654.321-00");
        manager.setSalary(5000.0);
        manager.setPassword(1234);

        System.out.println(manager.authenticate(1234));
        System.out.println("Name: " + manager.getName());
        System.out.println("CPF: " + manager.getCpf());
        System.out.println("Salary: " + manager.getSalary());
        System.out.println("Bonus: " + manager.getBonus());

    }
    
}