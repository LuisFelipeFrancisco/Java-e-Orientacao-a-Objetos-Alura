package Variables;

public class CharAndString {
    public static void main (String[] args){
        char letter = 'A';
        System.out.println(letter);

        char value = 65;            //Will print A
        System.out.println(value);

        char value2 = '\u0041';     //Will print A
        System.out.println(value2);

        value = (char) (value + 1); //Will print B
        System.out.println(value);

        String sentence = "Testing String";
        System.out.println(sentence);

        sentence = sentence + 2022;
        System.out.println(sentence);
    }
    
}
