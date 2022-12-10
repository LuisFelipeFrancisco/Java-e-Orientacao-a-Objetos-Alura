
public class Test {
    public static void main(String[] args){

        String name = "Felype";
        System.out.println(name);

        name = name.replace('y', 'i');
        System.out.println(name);

        name = name.toLowerCase();
        System.out.println(name);

        name = name.toUpperCase();
        System.out.println(name);

        char c = 'I';
        char d = 'Y';

        name = name.replace(c, d);
        System.out.println(name);

        char e = name.charAt(3);
        System.out.println(e);

        int f = name.indexOf('Y');
        System.out.println(f);

        int g = name.indexOf('Y', 4);
        System.out.println(g);

        name = name.substring(0, 2);
        System.out.println(name);

        name = name.concat("lipe");

        System.out.println(name.length());

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        String empty = "";
        System.out.println(empty.isEmpty());
        System.out.println(name.isEmpty());

        String name2 = "    Felipe";
        System.out.println(name2);
        System.out.println(name2.trim());

        boolean containsly = name.contains("ly");
        System.out.println(containsly);
        boolean containsli = name.contains("li");
        System.out.println(containsli);

        String fullname = "Luis Felipe";
        System.out.println(fullname);
        String[] names = fullname.split(" ");
        System.out.println(names[0]);
        System.out.println(names[1]);

    }
}
