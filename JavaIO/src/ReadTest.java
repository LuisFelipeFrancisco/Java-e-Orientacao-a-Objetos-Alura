import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadTest {
    public static void main(String[] args) throws IOException {

            InputStream fis = new FileInputStream ("lorem.txt");
            Reader is = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(is);

			System.out.println(br.ready());

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

            br.close();
    }
}