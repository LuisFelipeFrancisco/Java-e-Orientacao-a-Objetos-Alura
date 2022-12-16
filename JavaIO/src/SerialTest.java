import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialTest {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        String name = "Luis Felipe Francisco Fermino Ferreira";

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.bin"));
        out.writeObject(name);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.bin"));
        String name2 = (String) in.readObject();
        in.close();
        System.out.println(name2);
    }
}
