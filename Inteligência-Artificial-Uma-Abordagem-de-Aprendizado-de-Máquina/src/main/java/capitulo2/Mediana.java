package capitulo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import dataset.Service;

public class Mediana {
    public static Double mediana(ArrayList<Double> numbers) {
        Collections.sort(numbers);
        int size = numbers.size();
        int pivot = (int) Math.floor(size / 2);
        if (size % 2 == 0) {
            return (numbers.get(pivot) + numbers.get(pivot - 1)) / 2;
        } else {
            return (numbers.get(pivot));
        }
    }

    public static void main(String[] args) {
        ArrayList<Double> salaries = Service.getSalaries();
        Double mediana = mediana(salaries);
        System.out.println(mediana);
    }
}
