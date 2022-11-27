package FlowControl;

public class NestedLoops {

    public static void main(String[] args) {
        for (int multi = 1; multi <= 10; multi++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(multi * j + "\t");
            }
            System.out.println();
        }
    }
}
