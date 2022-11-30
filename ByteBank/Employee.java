public class Employee {
    
    private String name;
    private String cpf;
    private double salary;

    public double getBonus() {
        return this.salary * 0.2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

/* Public keyword is used to make a class public
 * Protected keyword is used to make a variable accessible to the child class
 * Private keyword is used to make a variable accessible only to the class
*/
