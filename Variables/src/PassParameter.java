
public class PassParameter {
    public static void main(String[] args) {
        int value = 10;
        int value2 = 5;
        value = value2;
        value2 = 15;

        System.out.println("Value: " + value);
    }
    
}