package Capitulo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
        ArrayList<Double> odd = new ArrayList<Double>(Arrays.asList(17.0, 4.0, 21.0, 8.0, 4.0));
        ArrayList<Double> even = new ArrayList<Double>(Arrays.asList(17.0, 4.0, 8.0, 21.0, 4.0, 15.0, 13.0, 9.0));
        System.out.println("Array de tamanho ímpar");
        System.out.println(mediana(odd));
        System.out.println("Array de tamanho par:");
        System.out.println(mediana(even));
    }
}
