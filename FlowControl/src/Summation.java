package src;

public class Summation {

        public static void main(String[] args) {
            int count = 0;
            int sum = 0;
            while (count <= 10) {
                sum += count;
                count++;
                System.out.println("Sum is: " + sum);
            }
            System.out.println(sum);
        }
    
}
