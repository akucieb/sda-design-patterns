package pl.sda.poznan.factory.model;

public class Employee {
    private String name;
    private String surname;
    private String email;
    private double salary;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public Employee(String name, String surname, String email, double salary) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{Employee" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
