package capitulo2;

import java.util.ArrayList;

public class Multivariados {
    public static Double covariancia(ArrayList<Double> firstData, ArrayList<Double> secondData) {
        Double soma = 0.;
        int size = firstData.size();
        Double mediafirstData = Media.media(firstData);
        Double mediaSecondData = Media.media(secondData);
        for (int k = 0; k < size; k++) {
            soma += (firstData.get(k) - mediafirstData) * (secondData.get(k) - mediaSecondData);
        }

        Double covariancia = soma / (size - 1);
        return covariancia;
    }
}
