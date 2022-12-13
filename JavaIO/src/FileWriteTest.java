import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {
    public static void main(String[] args) throws IOException {

        // FileWriter fw = new FileWriter("test.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
        bw.write("Hello World!");
        bw.newLine();
        bw.newLine();
        bw.write("Hello World!");
        bw.newLine();
        bw.write("Hello World!");

        bw.close();

    }
}