package dataset;

public class Employee {
    public int workYear;
    public String experienceLevel;
    public String employmentType;
    public String jobTitle;
    public Double salary;
    public String salaryCurrency;
    public Double salaryInUSD;
    public String emplyeeResidence;
    public Double remoteRatio;
    public String companyLocation;
    public String companySize;

    public Employee(
        int workYear,
        String experienceLevel,
        String employmentType,
        String jobTitle,
        Double salary,
        String salaryCurrency,
        Double salaryInUSD,
        String employeeResidence,
        Double remoteRatio,
        String companyLocation,
        String companySize
    ) {
        this.workYear = workYear;
        this.experienceLevel = experienceLevel;
        this.employmentType = employmentType;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.salaryCurrency = salaryCurrency;
        this.salaryInUSD = salaryInUSD;
        this.emplyeeResidence = employeeResidence;
        this.remoteRatio = remoteRatio;
        this.companyLocation = companyLocation;
        this.companySize = companySize;
    }

    public Double getSalary() {
        return this.salaryInUSD;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void printInfo() {
        System.out.printf("Work Year: %d", this.workYear);
    }
    
}
