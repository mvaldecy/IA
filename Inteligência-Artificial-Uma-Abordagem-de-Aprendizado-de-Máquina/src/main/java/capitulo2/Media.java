package capitulo2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import dataset.Employee;
import dataset.Service;

class Media {

    public static Double media(ArrayList<Double> numbers) {
        Optional<Double> soma = numbers.stream().reduce((accumulator, current) -> accumulator + current);
        int length = numbers.size();
        if (soma == null)
            return null;
        else {
            Double result = soma.get() / length;
            // set precision logic https://stackoverflow.com/questions/14845937/java-how-to-set-precision-for-double-value
            // DecimalFormat dec = new DecimalFormat("#0.00");
            // return dec.format(result);
            return result;
        }
    }

    public static void main(String[] args) {
        // ArrayList<Double> numbers = new ArrayList<Double>(Arrays.asList(1.0, 5.7, 7.9, 8.1, 4.7, 5.0));
        ArrayList<Double> employeesSalary = Service.getSalaries();
        Double result = media(employeesSalary);
        System.out.println(result);
    }
}