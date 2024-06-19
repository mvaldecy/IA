package dataset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyList {

    public static ArrayList<Frequency> getFrequencyList() { // to do: deixar mais generica. // adcionar parametros firstDownLimit, LastupLimit, interval and data
        ArrayList<Employee> employees = Service.getData();
        ArrayList<Frequency> frequencyList = new ArrayList<Frequency>();
        Collections.sort(employees, (i, j) -> i.getSalary().compareTo(j.getSalary()));  //https://stackoverflow.com/questions/2784514/sort-arraylist-of-custom-objects-by-property
        Double downValue = 10000.00;
        Double upValue = 15000.00;
        Double LastUpValue = 800000.0;
        while (upValue <= LastUpValue) {
            final Double finalDownValue = downValue;
            final Double finalUpValue = upValue;
            Frequency interval = new Frequency(finalDownValue, finalUpValue);
            ArrayList<Employee> filteredList = new ArrayList<Employee>(Arrays.asList(employees.stream()
            .filter((i) -> i.getSalary() > finalDownValue && i.getSalary() <= finalUpValue).toArray(Employee[]::new)));
            interval.setFrequency(filteredList.size());
            filteredList.stream().forEach((i -> interval.addEmployee(i)));
            frequencyList.add(interval);
            downValue += 5000.00;
            upValue += 5000.00;
        }
        return frequencyList;
    }

    public static void main(String[] args) {
        ArrayList<Frequency> result = getFrequencyList();
        result.stream().forEach((i) -> System.out.println(i.toString()));
        System.out.println(result.get(1570));
    }
}

/*
 * getdata
 * sort data
 * ----loop ---
 * filtra dados no intervalo -> gera um array com os dados 
 *  setFrequency
 * addemployee
 * -- recomeça o loop com atualizaçao dos intervalos
 * primeiro intervalo 10000.00 15000.00
 * ultimo intervalo xxxxxxxxx  30400000.00
 */