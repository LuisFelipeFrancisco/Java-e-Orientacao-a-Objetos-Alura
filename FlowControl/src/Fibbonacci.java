package src;

public class Fibbonacci {
    
    public static void main(String[] args) {
        int fib1 = 1;
        int fib2 = 1;
        int fib3 = 0;
        System.out.println(fib1);
        System.out.println(fib2);
        for (int i = 1; i <= 10; i++) {
            fib3 = fib1 + fib2;
            System.out.println(fib3);
            fib1 = fib2;
            fib2 = fib3;
        }
    }
}
