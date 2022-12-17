package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import models.CheckingAccount;
import models.Holder;

public class TestSerializing {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Holder client = new Holder();
        client.setName("Luis Felipe Francisco Fermino Ferreira");
        client.setCpf("123.456.789-00");
        client.setProfession("Software Engineer");

        CheckingAccount checkingAccount = new CheckingAccount(123, 321);
        checkingAccount.setHolder(client);
        checkingAccount.deposit(500);

        System.out.println("Serializing the account...");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("checkingAccount.bin"));
        oos.writeObject(checkingAccount);
        oos.close();

        System.out.println("Deserializing the account...");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("checkingAccount.bin"));
        CheckingAccount account = (CheckingAccount) ois.readObject();
        ois.close();

        System.out.println("Account deserialized:");
        System.out.println("Holder:  " + account.holder.getName());
        System.out.println("Agency:  " + account.getAgency());
        System.out.println("Account: " + account.getNumber());
        System.out.println("Balance: " + account.getBalance());

    }
    
}
