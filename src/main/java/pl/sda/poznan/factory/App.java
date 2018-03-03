package pl.sda.poznan.factory;

import pl.sda.poznan.factory.model.Company;
import pl.sda.poznan.factory.model.Employee;
import pl.sda.poznan.factory.writer.CompanyWriter;
import pl.sda.poznan.factory.writer.TxtCompanyWriter;


public class App {
    public static void main(String[] args) {
        Employee director = new Employee("Jan","Kowalski","jankowalski@gmail.com",2554037.25);
        Employee menager = new Employee("Marcin","Nowak","nowakm@gmail.com",154037.25);

        Company company = new Company();
        company.addEmployee(director);
        company.addEmployee(menager);

       CompanyWriter writer = new TxtCompanyWriter("firma.txt");
       writer.write(company);
       }
    }

