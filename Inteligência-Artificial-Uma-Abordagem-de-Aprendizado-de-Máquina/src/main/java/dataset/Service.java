package dataset;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class Service {
    public static ArrayList<Employee> getData() {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        
        // src/main/java/dataset/Dataset-salary-2024.csv
        try (Reader reader = new FileReader("src/main/java/dataset/Dataset-salary-2024.csv");
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader())) {
            
            for(CSVRecord record: csvParser) {
                int workYear = Integer.parseInt(record.get("work_year"));
                String experienceLevel = record.get("experience_level");
                String employmentType = record.get("employment_type");
                String jobTitle = record.get("job_title");
                Double salary = Double.parseDouble(record.get("salary"));
                String salaryCurrency = record.get("salary_currency");
                Double salaryInUSD = Double.parseDouble(record.get("salary_in_usd"));
                String employeeResidence = record.get("employee_residence");
                Double remoteRatio = Double.parseDouble(record.get("remote_ratio"));
                String companyLocation = record.get("company_location");
                String companySize = record.get("company_size");
                Employee employee = new Employee(
                    workYear,
                    experienceLevel,
                    employmentType,
                    jobTitle, salary,
                    salaryCurrency,
                    salaryInUSD,
                    employeeResidence,
                    remoteRatio,
                    companyLocation,
                    companySize);
                employees.add(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
           
    }

    public static ArrayList<Double> getSalaries() {
        ArrayList<Employee> employees = getData();
        ArrayList<Double> employeesSalary = new ArrayList<>(Arrays.asList(employees.stream().map((i) -> i.getSalary()).toArray(Double[]::new)));
        return employeesSalary;
    }

    public static Set<String> getJobTitles() {
        ArrayList<Employee> employees = getData();
        Set<String> jobTitles = new HashSet<String>(Arrays.asList(employees.stream().map((i) -> i.getJobTitle()).toArray(String[]::new)));
        return jobTitles;
    }

    public static Set<String> getExperienceLevels() {
        ArrayList<Employee> employees = getData();
        Set<String> experienceLevels = new HashSet<String>(Arrays.asList(employees.stream().map((i) -> i.getExperienceLevel()).toArray(String[]::new)));
        return experienceLevels;
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = getData();
        System.out.println(getExperienceLevels());
    }
}
