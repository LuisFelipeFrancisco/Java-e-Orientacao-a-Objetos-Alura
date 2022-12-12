import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class InputTest {
    public static void main(String[] args) throws IOException {

            InputStream fis = System.in;
            Reader is = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(is);

            OutputStream fos = new FileOutputStream("input.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            String line = br.readLine();

            while (line != null && !line.isEmpty()) {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }

            bw.close();
            br.close();
    }
}