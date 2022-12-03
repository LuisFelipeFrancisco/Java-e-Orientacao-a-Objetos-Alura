
public class Flow {

    public static void main(String[] args) {
        System.out.println("Starting Main");
        method1();
        System.out.println("Ending Main");
    }

    private static void method1() {
        System.out.println("Starting Method 1");
        method2();
        System.out.println("Ending Method 1");
    }

    private static void method2() {
        System.out.println("Starting Method 2");
        for (int i = 1; i < 5; i++) {
            System.out.println(i);        
        }
        System.out.println("Ending Method 2");
    }
}

/*
 * Stack is a data structure that stores data in a LIFO (Last In First Out) manner.
 */