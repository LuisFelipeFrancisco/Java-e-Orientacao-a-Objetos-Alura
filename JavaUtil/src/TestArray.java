
public class TestArray {
    public static void main(String[] args) {
        
        int[] age = new int[5];
        // age[0] = 10;
        // age[1] = 20;
        // age[2] = 30;
        // age[3] = 40;
        // age[4] = 50;
        for (int i = 0; i < age.length; i++) {
            age[i] = (i + 1) * 10;
        }

        for (int i = 0; i < age.length; i++) {
            System.out.println("Age " + i + ": " + age[i]);
        }

        System.out.println("Age 5: " + age[5]);
        
    }
}
