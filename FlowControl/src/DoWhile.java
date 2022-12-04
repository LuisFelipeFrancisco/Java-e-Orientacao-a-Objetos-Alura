package src;

public class DoWhile {
    
    public static void main(String[] args) {
        int count = 0;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count <= 10);
        System.out.println(count);
    }
    
}