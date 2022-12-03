
public class TestSystem {
    
        public static void main(String[] args) {
            Manager manager = new Manager();
            manager.setPassword(6666);

            Admistrator admistrator = new Admistrator();
            admistrator.setPassword(5555);

            InternSystem internSystem = new InternSystem();
            System.out.println("Manager");
            internSystem.authenticate(manager);
            System.out.println("Admistrator");
            internSystem.authenticate(admistrator);
        }

}