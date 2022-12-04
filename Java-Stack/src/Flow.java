
public class Flow {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            method1();
        } catch (ArithmeticException | NullPointerException ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
    }

    private static void method1() {
        System.out.println("Starting Method 1");
        method2();
        System.out.println("Ending Method 1");
    }

    private static void method2() {
        System.out.println("Starting Method 2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            int a = i / 0;
            Account acc = null;
            acc.deposit();
        }
        System.out.println("Ending Method 2");
    }

}

/*
 * Stack is a data structure that stores data in a LIFO (Last In First Out) manner.
 * Catch blocks are executed in the reverse order of their appearance in the code.
 * Multiple catch can be implemented in a single try block. with a | (pipe) between them.
 */