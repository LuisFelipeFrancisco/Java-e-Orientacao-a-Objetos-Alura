
public class Admistrator extends Employee implements Authenticator {

        private Auth auth;

        public Admistrator() {
            this.auth = new Auth();
        }

        @Override
        public void setPassword(int password) {
            this.auth.setPassword(password);
        }

        @Override
        public boolean authenticate(int password) {
            return this.auth.authenticate(password);
        }

        @Override
        public double getBonus() {
            return super.getSalary() * 0.5;
        }
        
}


/*
* extends keyword is used to inherit a class
* super keyword is used to call the parent class constructor
*/