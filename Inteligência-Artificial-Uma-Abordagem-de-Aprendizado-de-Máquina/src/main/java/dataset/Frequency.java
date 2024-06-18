package dataset;

import java.util.ArrayList;

public class Frequency {
    Double downValue;
    Double upValue;
    int frequency;
    ArrayList<Employee> employees;

    public Frequency(Double downValue, Double upValue) {
        this.downValue = downValue;
        this.upValue = upValue;
        this.frequency = 0;
        this.employees = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String toString() {
        return String.format("Intervalo: %.2f - %.2f | Frequencia: %d", this.downValue, this.upValue, this.frequency);
    }


}
