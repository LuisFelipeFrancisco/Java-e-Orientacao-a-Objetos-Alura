package models;

import java.io.Serializable;

public class Holder implements Serializable{
    private String name;
    private String cpf;
    private String profession;
    public Holder getHolder(Account account) {
    	return this;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfession() {
        return this.profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
    
}