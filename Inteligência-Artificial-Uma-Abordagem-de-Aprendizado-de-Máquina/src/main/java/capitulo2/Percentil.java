package capitulo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import dataset.Service;

public class Percentil { // a corrigir
    public static Double percentil(ArrayList<Double> numbers, Double percentil) {
        Collections.sort(numbers);
        int size = numbers.size();
        Double np = size * percentil;
        if ((np * 100) % 100 == 0) { // checa se np é inteiro.
            return (numbers.get(np.intValue() - 1) + numbers.get(np.intValue())) / 2;
        } else {
            int position = (int) Math.floor(np);
            return numbers.get(position);
        }
    }

    public static void main(String[] args) {
        ArrayList<Double> salaries = Service.getSalaries();
        System.out.println(percentil(salaries, 0.73));
        System.out.println(percentil(salaries, 0.2));

    }
}
