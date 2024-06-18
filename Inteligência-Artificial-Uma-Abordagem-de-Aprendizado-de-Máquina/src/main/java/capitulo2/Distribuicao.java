package capitulo2;

import java.util.ArrayList;
import java.util.Collections;

import dataset.Employee;
import dataset.Service;

public class Distribuicao {
    

    public static Double obliquidade() {
        ArrayList<Double> salaries = Service.getSalaries();
    }
    public static void main(String[] args) {
        ArrayList<Double> salaries = Service.getSalaries();
        Double max = Collections.max(salaries).doubleValue();
        Double min = Collections.min(salaries);
        System.out.println(salaries.size()); 
        System.out.println(max);
        System.out.println(min);
    }
}
