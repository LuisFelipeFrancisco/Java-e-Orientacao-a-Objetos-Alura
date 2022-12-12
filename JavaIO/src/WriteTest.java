import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class WriteTest {
    public static void main(String[] args) throws IOException {

        OutputStream fis = new FileOutputStream("name.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fis);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("name name name name name name");

        bw.close();

    }
}