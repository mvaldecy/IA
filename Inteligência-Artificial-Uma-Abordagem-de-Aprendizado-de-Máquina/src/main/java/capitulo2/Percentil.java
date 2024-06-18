package capitulo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Percentil { // a corrigir
    public static Double percentil(ArrayList<Double> numbers, Double percentil) {
        Collections.sort(numbers);
        System.out.println(numbers);
        int size = numbers.size();
        Double np = size * percentil;
        System.out.println("np");
        System.out.println(np);
        if ((np * 100) % 100 == 0) { // checa se np é inteiro.
            return (numbers.get(np.intValue() - 1) + numbers.get(np.intValue())) / 2;
        } else {
            int position = (int) Math.floor(np);
            return numbers.get(position);
        }
    }

    public static void main(String[] args) {
        ArrayList<Double> odd = new ArrayList<Double>(Arrays.asList(17.0, 4.0, 21.0, 8.0, 4.0));
        ArrayList<Double> even = new ArrayList<Double>(Arrays.asList(17.0, 4.0, 8.0, 21.0, 4.0, 15.0, 13.0, 9.0));
        System.out.println("np não inteiro.");
        System.out.println(percentil(even, 0.73));
        System.out.println("np inteiro.");
        System.out.println(percentil(odd, 0.2));

    }
}
