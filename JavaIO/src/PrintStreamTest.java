import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamTest {
    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream("test.txt");

        ps.println("Hello World");
        ps.println("Hello World");
        ps.println("");
        ps.println("Hello World");

        ps.close();
    
        PrintWriter pw = new PrintWriter("test2.txt");

        pw.print("Hello World");
        pw.print(System.lineSeparator());
        pw.print("Hello World");
        pw.print(System.lineSeparator());
        pw.print("Hello World");

        pw.close();
    }
}