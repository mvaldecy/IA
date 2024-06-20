package capitulo2;

import java.util.ArrayList;

public class Multivariados {

    public static Double covariancia(ArrayList<Double> i, ArrayList<Double> j) {
        Double media_i = Media.media(i);
        Double media_j = Media.media(j);
        int size = i.size();
        Double soma = 0.0;
        for(int k = 0; k < size; k++) {
            soma += (i.get(k) - media_i) * (j.get(k) - media_j);
        }
        return soma / (size - 1);
    }

    public static ArrayList<ArrayList<Double>> covarianciaMatrix(ArrayList<ArrayList<Double>> dataArray) {
        int dataArraysize = dataArray.size();
        ArrayList<ArrayList<Double>> covarianciaMatrix = new ArrayList<ArrayList<Double>>();
        for (int i = 0; i < dataArraysize; i++) {
            ArrayList<Double> matrixLine = new ArrayList<Double>();
            for (int j = 0; j < dataArraysize; j++) {
                Double cov_ij = covariancia(dataArray.get(i), dataArray.get(j));
                matrixLine.add(cov_ij);
            }
            covarianciaMatrix.add(matrixLine);
            
        }
        return covarianciaMatrix;
    }
}
