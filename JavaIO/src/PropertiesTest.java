import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) throws Exception {

        Properties props = new Properties();
        props.setProperty("login", "google"); 
        props.setProperty("password", "averylongpasswordthatnobodyknowsbecauseitsencrypted");
        props.setProperty("address", "www.google.com.br");

        props.store(new FileWriter("conf.properties"), "comment"); //must be .properties file

        Properties propsReader = new Properties();
        propsReader.load(new FileReader("conf.properties"));

        String login = propsReader.getProperty("login");
        String password = propsReader.getProperty("password");
        String address = propsReader.getProperty("address");

        System.out.println(login);
        System.out.println(password);
        System.out.println(address);

    }
    
}
