public class TestEmployee {
    
    public static void main(String[] args) {
        Employee Employee = new Employee();
        Employee.setName("Felipe");
        Employee.setCpf("123.456.789-00");
        Employee.setSalary(2500.0);
        
        System.out.println("Name: " + Employee.getName());
        System.out.println("CPF: " + Employee.getCpf());
        System.out.println("Salary: " + Employee.getSalary());
        System.out.println("Bonus: " + Employee.getBonus());

        Mananger mananger = new Mananger();
        mananger.setName("Luis");
        mananger.setCpf("987.654.321-00");
        mananger.setSalary(5000.0);

        System.out.println("Name: " + mananger.getName());
        System.out.println("CPF: " + mananger.getCpf());
        System.out.println("Salary: " + mananger.getSalary());
        System.out.println("Bonus: " + mananger.getBonus());
        System.out.println("Password: " + mananger.setPassword(1234));
        System.out.println(mananger.authenticate(1234));
    
    }
}
