package capitulo2;

import java.util.ArrayList;
import java.util.Collections;


import dataset.Service;

public class Distribuicao {

    private static Double momento(ArrayList<Double> data, int k) {
        Double media = Media.media(data);
        Double dp = Espalhamento.desvioPadrao(data);
        int size = data.size();
        Double soma = 0.;
        for(int i = 0; i < size; i++) {
            soma += Math.pow(data.get(i) - media, k);
        }
        return soma /((size - 1) * Math.pow(dp, k));
    }

    public static Double obliquidade(ArrayList<Double> data) {
        return momento(data, 3);
    }

    public static Double curtose(ArrayList<Double> data) {
        return momento(data, 4);
    }


    public static void main(String[] args) {
        ArrayList<Double> salaries = Service.getSalaries();
        Double obliquidade = obliquidade(salaries);
        Double curtose = curtose(salaries);
        System.out.println("Obliquidade: " + obliquidade);
        System.out.println("Curtose: " + curtose);
    }
}
