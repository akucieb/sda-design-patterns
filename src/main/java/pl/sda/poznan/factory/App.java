package pl.sda.poznan.factory;

import pl.sda.poznan.factory.model.Company;
import pl.sda.poznan.factory.model.Employee;
import pl.sda.poznan.factory.writer.CompanyWriter;
import pl.sda.poznan.factory.writer.TxtCompanyWriter;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Employee director = new Employee("Jan", "Kowalski", "jankowalski@gmail.com", 2554037.25);
        Employee menager = new Employee("Marcin", "Nowak", "nowakm@gmail.com", 154037.25);

        Company company = new Company();
        company.addEmployee(director);
        company.addEmployee(menager);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku, do ktorego chcesz zapisac:");

        String filename = scanner.next();
        CompanyWriterFactory companyWriterFactory = new CompanyWriterFactory();

        try {
            CompanyWriter writer = companyWriterFactory.create(filename);
            writer.write(company);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

