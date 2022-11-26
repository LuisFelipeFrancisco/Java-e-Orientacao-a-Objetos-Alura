package FlowControl;

public class Conditions {
    public static void main(String[] args) {
        int age = 16;
        int companion = 1;
        if (age >= 18) {
            System.out.println("You are an adult");
            System.out.println("Welcome.");
        } else {
            if (companion >= 2) {
                System.out.println("You are not an adult, but you can enter with a companion.");
            } else {
                System.out.println("You are not an adult, you can't enter.");
            }
        }
    }
}
