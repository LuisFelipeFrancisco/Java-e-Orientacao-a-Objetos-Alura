package test;
import models.Administrator;
import models.InternSystem;
import models.Manager;

public class TestSystem {
    
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setPassword(6666);

        Administrator administrator = new Administrator();
        administrator.setPassword(5555);

        InternSystem internSystem = new InternSystem();
        System.out.println("Manager");
        internSystem.authenticate(manager);
        System.out.println("Administrator");
        internSystem.authenticate(administrator);
    }

}