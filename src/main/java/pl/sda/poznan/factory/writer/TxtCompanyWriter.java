package pl.sda.poznan.factory.writer;

import pl.sda.poznan.factory.model.Company;
import pl.sda.poznan.factory.model.Employee;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TxtCompanyWriter implements CompanyWriter {

    private final String path;

    public TxtCompanyWriter(String path) {
        this.path = path;
    }

    @Override
    public void write(Company company) {
        List<String> strings = new ArrayList<>();
        for (Employee employee : company.getEmployees()) {
            strings.add(employee.toString());
        }
        try {
            Files.write(Paths.get(path), strings);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
