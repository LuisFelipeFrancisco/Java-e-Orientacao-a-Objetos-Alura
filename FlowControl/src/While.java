package src;

public class While {
    
    public static void main(String[] args) {
        int count = 0;
        while (count <= 10) {
            System.out.println("Count is: " + count);
            //count = count + 1;
            //count += 1;
            count++;
        }
        System.out.println(count);
    }
    
}