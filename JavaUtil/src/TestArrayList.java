import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("AA");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Size: " + list.size());

        list.remove(5);

        System.out.println("After removing the element at index 5:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Size: " + list.size());

        list.remove("B");

        System.out.println("After removing the element B:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Size: " + list.size());

        for (String s : list) {
            System.out.println(s);
        }

        boolean isFound = list.contains("F");
        System.out.println("F is found: " + isFound);



    }
    
}
