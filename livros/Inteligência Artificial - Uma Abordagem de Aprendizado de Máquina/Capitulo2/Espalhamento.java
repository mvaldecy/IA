/*
 * As medidas de espalhamento medem a dispersão ou espalhamento de um conjunto de valores.
 * Assim, elas permitem observar se os valores estão amplamente espalhados ou relativamente
 * concentrados em torno de um valor, por exemplo, a média.

 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Espalhamento {

    /*
     * O intervalo é a medida mais simples e mostra espalhamento máximo entre os
     * valores de um conjunto. Assim, sejam xj = {x1, x2, ..., xn} os valores do
     * atributo para n objetos. 
     */
    public static Double intervalo(ArrayList<Double> numbers) {
        Double max = Collections.max(numbers);
        Double min = Collections.min(numbers);
        return max - min;
    }

    /*
     * Se a maioria dos valores for próxima de um ponto, com um pequeno número de valores extremos
     *  o intervalo não será uma boa medida do espalhamento dos valores. A medida mais utilizada para
     * avaliar o espalhamento de valores é a variância,
     */

    public static Double variancia(ArrayList<Double> numbers) {
        Double media = Media.media(numbers);
        int size = numbers.size();
        Double soma = 0.0;
        for(int i = 0; i < numbers.size(); i++) {
            soma += Math.pow((numbers.get(i) - media), 2);
        }
        return soma / (size - 1);
    }
    
    public static Double desvioPadrao(Double variancia) {
        Double dp = Math.sqrt(variancia);
        return dp;
    }

    public static Double desvioMedioAbs(ArrayList<Double> numbers) {
        Double media = Media.media(numbers);
        Double soma = 0.0;
        int size = numbers.size();
        for(int i = 0; i < size; i++) {
            soma += Math.abs(numbers.get(i) - media);
        }
        return soma / size;
    }

    public static Double desvioMedianoAbs(ArrayList<Double> numbers) {
        ArrayList<Double> newNumbers = new ArrayList<Double>();
        Double media = Media.media(numbers);
        for(int i = 0; i < numbers.size(); i++) {
            newNumbers.add(Math.abs(numbers.get(i) - media));
        }

        return Mediana.mediana(newNumbers);
    }

    public static Double intervaloInterquartil(ArrayList<Double> numbers) {
        Double q3 = Percentil.percentil(numbers, 0.75);
        Double q1 = Percentil.percentil(numbers, 0.25);
        return q3 - q1;
    }
    
    public static void main(String[] args) {
        int q;
        ArrayList<Double> numbers = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a quantidade de dados:");
        q = scanner.nextInt();
        for(int i = 0; i < q; i ++) {
            System.out.println("Insira o dado " + (i + 1));
            numbers.add(scanner.nextDouble());
        }
        scanner.close();
        Double intervalo = intervalo(numbers);
        Double variancia = variancia(numbers);
        Double desvioPadrao = desvioPadrao(variancia);
        Double desvioMedioAbsoluto = desvioMedioAbs(numbers);
        Double desvioMedianoAbsoluto = desvioMedianoAbs(numbers);
        Double intervaloInterquartil = intervaloInterquartil(numbers);
        System.out.println("Intervalo: " + intervalo);
        System.out.println("Variância: " + variancia);
        System.out.println("Desvio Padrão: " + desvioPadrao);
        System.out.println("Desvio Médio Absoluto (AAD): " + desvioMedioAbsoluto);
        System.out.println("Desvio Mediano Absoluto (MAD): " + desvioMedianoAbsoluto);
        System.out.println("Intervalo Interquartil (IQR): " + intervaloInterquartil);
        
    }
}
