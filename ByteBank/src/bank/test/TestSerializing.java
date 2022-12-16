package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import models.Holder;

public class TestSerializing {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Holder client = new Holder();
        client.setName("Luis Felipe Francisco Fermino Ferreira");
        client.setCpf("123.456.789-00");
        client.setProfession("Software Engineer");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("client.ser"));
        oos.writeObject(client);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("client.ser"));
        Holder holder = (Holder) ois.readObject();
        ois.close();

        System.out.println(holder.getName());
        System.out.println(holder.getCpf());
        System.out.println(holder.getProfession());

    }
    
}
