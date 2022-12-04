package src;

public class ConditionsSlim {
    public static void main(String[] args) {
        int age = 16;
        boolean companion = true;

        if (age >= 18 || companion == true) {
            System.out.println("You can enter the club");
        } else {
            System.out.println("You can't enter the club");
        }
    }
    
}