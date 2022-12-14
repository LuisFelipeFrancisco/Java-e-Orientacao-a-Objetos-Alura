import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class FileScannerTest {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("accounts.csv"));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);

            // String[] values = line.split(",");
            // System.out.println(Arrays.toString(values));

            // System.out.println("Holder: " + values[3]);

            Scanner lineScanner = new Scanner(line);
            lineScanner.useLocale(Locale.US);
            lineScanner.useDelimiter(",");

            String value1 = lineScanner.next();
            int value2 = lineScanner.nextInt();
            int value3 = lineScanner.nextInt();
            String value4 = lineScanner.next();
            double value5 = lineScanner.nextDouble();
            
            System.out.println("Account type: " + value1);
            System.out.println("Agency: " + value2);
            System.out.println("Account number: " + value3);
            System.out.println("Holder: " + value4);
            System.out.println("Balance: " + value5);

            lineScanner.close();
        }

        scanner.close();
    }

}