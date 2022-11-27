package FlowControl;

//imprimir os fatoriais de 1 a 10

public class Factorial {
    
    public static void main(String[] args) {
        int factorial = 1;
        for (int i = 1; i <= 10; i++) {
            //factorial = factorial * i;
            factorial *= i;
            System.out.println("Factorial of " + i + " is " + factorial);
        }
    }
}
