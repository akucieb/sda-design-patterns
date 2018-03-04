package pl.sda.poznan.singleton;

import pl.sda.poznan.factory.model.Company;
import pl.sda.poznan.factory.model.Employee;
import pl.sda.poznan.factory.writer.CompanyWriter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumDemo {
    public static void main(String[] args) {
        CompanyWriter writer = EnumFactory.INSTANCE.create("enum.xml");
        Employee director = new Employee("Jan", "Kowalski", "jankowalski@gmail.com", 2554037.25);
        Employee menager = new Employee("Marcin", "Nowak", "nowakm@gmail.com", 154037.25);

        Company company = new Company();
        company.addEmployee(director);
        company.addEmployee(menager);

        Class<? extends EnumFactory> aClass = EnumFactory.INSTANCE.getClass();
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor c : declaredConstructors) {
            c.setAccessible(true);
        }

        Constructor<?> declaredConstructor = declaredConstructors[0];
        try {
            Object o = declaredConstructor.newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.out.println(e.getMessage());
        }
        writer.write(company);

    }
}
